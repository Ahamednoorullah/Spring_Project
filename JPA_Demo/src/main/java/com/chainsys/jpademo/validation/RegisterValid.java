package com.chainsys.jpademo.validation;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;

import com.chainsys.jpademo.model.RegisterForm;



public class RegisterValid {

	public boolean isValid(RegisterForm registerForm) {
		String name = registerForm.getName();
		String email = registerForm.getEmail();
		String password = registerForm.getPassword();
		String cnfpassword = registerForm.getCnfpassword();
		boolean nameValidation = nameValid(name);
		boolean emailValidation = emailValid(email);
		if ((email != "")&&(name != "")&&(password != "")&&(cnfpassword!="")&&
				(password.contentEquals(cnfpassword))&&(nameValidation==true)&&
				(emailValidation==true)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean nameValid(String name) {
		String nameRegex = "^[a-zA-Z][\\w_]{4,29}$";
		Pattern pattern = Pattern.compile(nameRegex, Pattern.MULTILINE);
		
	    if (pattern.matcher(name).matches()) {
			return true;
		} else {
            return false;
		}
	}
	
	public boolean emailValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex,Pattern.MULTILINE);
		if (pattern.matcher(email).matches()) {
			return true;
			
		} else {
           return false;
		}
	}
}
