package com.annot.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {

	
	
	@Test
	@Parameters({"username","password"})
	private void Credentials(@Optional("Suresh") String username, String password) {
		
		System.out.println("username :"+username);
		
		System.out.println("Username :"+password);
		
		

	}
	
	
	
	
	
	
}
