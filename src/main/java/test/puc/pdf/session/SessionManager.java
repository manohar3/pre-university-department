package test.puc.pdf.session;

import java.util.Base64;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.Cookie;

public class SessionManager {
	
	private static Set<String> sessions = new TreeSet<String>();
	
	public static void cacheSession(String session) {
		sessions.add(session);
	}
	
	public static boolean hasSession(String session) {
		return sessions.contains(session);
	}

	public static boolean removeSession(String session) {
		return sessions.remove(session);
	}
	
	public static boolean isSessionValid(Cookie []cookies) {
		if(cookies != null) {
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals("APPSESSION")) {
					String session = cookie.getValue();
					if(SessionManager.hasSession(session)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static String getUserFromCookie(Cookie []cookies) {
		if(cookies != null && isSessionValid(cookies)) {
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals("APPSESSION")) {
					String session = cookie.getValue();
					String payload = new String(Base64.getDecoder().decode(session));
					return payload.split(":")[0];
				}
			}
		}
		return null;
	}
	
	public static boolean isUserAdmin(Cookie []cookies) {
		if(isSessionValid(cookies)) {
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals("APPSESSION")) {
					String session = cookie.getValue();
					String payload = new String(Base64.getDecoder().decode(session));
					if(payload.split(":")[0].equals("admin")) {
						return true;
					}
				}
			}
		}
		return  false;
	}
}
