package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {

	public String maskPassword(String password) {
		if(password.length() < 5)
			return "Password demasiado corto";
		if(password.length() >= 5 && password.length() <= 8)
			return "********";
		if(password.length() >= 12 && password.length() <= 40)
			return "************";
		if(password.length() > 40)
			return "Password demasiado largo";
		
		String maskedPasswd = "";
		for (int i = 0; i < password.length(); i++) {
			maskedPasswd += "*";
		}
		
		return maskedPasswd;
	}
	
}
