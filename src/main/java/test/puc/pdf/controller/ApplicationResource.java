package test.puc.pdf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.puc.pdf.generator.PDFGenerator;
import test.puc.pdf.model.Application;
import test.puc.pdf.repository.ApplicationRepository;
import test.puc.pdf.session.SessionManager;

@RestController
public class ApplicationResource {
	
	@Autowired
	private ApplicationRepository applicationRepository;
	 
	@RequestMapping("/")
	public String home() {
		return "Welcome";
	} 
	
	@PostMapping("/application")
	public  ResponseEntity newApplication(@RequestBody Application newApplication, HttpServletRequest request) throws Exception{
		 if(SessionManager.isSessionValid(request.getCookies())) {
			 PDFGenerator.generate(newApplication.getAdmissionNumber(), newApplication.getSatsNumber(), newApplication.getLanguages(), 
					 newApplication.getMedium(), newApplication.getSection(), newApplication.getCategory());
			 applicationRepository.save(newApplication);
			 return ResponseEntity.ok().build();
		 }else {
			 return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		 }
	}
	
	@GetMapping("/application")
	public  ResponseEntity getApplications(@RequestBody Application newApplication) throws Exception{
		 PDFGenerator.generate(newApplication.getAdmissionNumber(), newApplication.getSatsNumber(), newApplication.getLanguages(), 
				 newApplication.getMedium(), newApplication.getSection(), newApplication.getCategory());
		 return ResponseEntity.ok(applicationRepository.findAll());
	}
}




