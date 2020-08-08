package test.puc.pdf.controller;

import java.util.Base64;
import java.util.Iterator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import test.puc.pdf.model.User;
import test.puc.pdf.repository.UserRepository;
import test.puc.pdf.session.SessionManager;



@RestController
public class AuthenticationResource {
	
	@Autowired
	private UserRepository userRepository;
	
	String adminpass="password";
	@PostMapping("/login")
	public  ResponseEntity login(@RequestBody User login, HttpServletResponse response) throws Exception{
		String username = login.getUsername();
		String password = login.getPassword();
		Cookie cookie = null;		
		Iterator<User> itr = userRepository.findAll().iterator();
		while(itr.hasNext()) {
			User user = itr.next();
			if(user.getUsername().equals(username)) {
				if(user.getPassword().equals(password)) {
					String payload=username+":"+password;
					String session = new String(Base64.getEncoder().encode(payload.getBytes()));
				    cookie = new Cookie("APPSESSION", session);		
				    SessionManager.cacheSession(session);
				}
			}
		}
		if( cookie != null ) {
			response.addCookie(cookie);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		
	}
	
	@GetMapping("/logout")
	public  ResponseEntity login(HttpServletRequest request, HttpServletResponse response) throws Exception{
		for(Cookie cookie:request.getCookies()) {
			if(cookie.getName().equals("APPSESSION")) {
				String session = cookie.getValue();
				if(SessionManager.hasSession(session)) {
					SessionManager.removeSession(session);
				}
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
		}
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/user")
	public  ResponseEntity create(@RequestBody User user, HttpServletResponse response) throws Exception{
		userRepository.save(user);
		return ResponseEntity.ok().build();
	}
}
