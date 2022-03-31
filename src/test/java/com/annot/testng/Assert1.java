package com.annot.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
	
	
	
	@Test
	
	private void username() {

		String exp_username = "starc";
		String actual_username = "starc123";
		
		SoftAssert soft = new SoftAssert();
	
	soft.assertEquals(actual_username, exp_username);
	
	System.out.println("Assert verification");
	}	
	

}
