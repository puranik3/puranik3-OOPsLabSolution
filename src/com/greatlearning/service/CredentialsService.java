package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.util.Random;

/* import Employee */
public class CredentialsService {
	// Step 3a
	public String generateEmailAddress( Employee emp ) {
		/**
		 * generate email and return it
		 */
		StringBuilder builder = new StringBuilder();
		builder
			.append( emp.getFirstName() )
			.append( emp.getLastName() )
			.append( "@" )
			.append( emp.getDepartment() )
			.append( ".abc.com" );
		
		return builder.toString();
	}
	
	// Step 4a
	public String generatePassword() {
		/**
		 * generate a String of 8 characters (randomly chosen from uppercase, lowercase, digits, special characters) 
		 */
		String allPossibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>)";
		Random random = new Random();
		
		String password = "";
		
		// You can do this 8 times and then form the password based on the random string (with single character) obtained
		for( int i = 0; i < 8; i++ ) {
			int idx = random.nextInt( allPossibleChars.length() );
			password = password + allPossibleChars.charAt( idx ); // "D" / "^"
		}
		
		return password;
	}
	
	// Step 4b
	public void showCredentials( Employee emp, String email, String password ) {
		System.out.println( "Dear " + emp.getFirstName() + ", here are your credentials..." );
		System.out.println( "Email : " + email );
		System.out.println( "Password : " + password );
	}
}
