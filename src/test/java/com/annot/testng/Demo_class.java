package com.annot.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_class {
	
	
	@Test(retryAnalyzer = Retry_class.class)
	
	private void username() {

		String expected_usernmae = "strac123";
		
		String actual_username = "starc";
		
		Assert.assertEquals(actual_username,expected_usernmae);
		
	}
	

	@Test
	
	private void password() {

	
String expected_password = "strac123";
		
		String actual_password = "starc";
		
		Assert.assertEquals(actual_password,expected_password);
	
	
	
	
	
	
	}

}
