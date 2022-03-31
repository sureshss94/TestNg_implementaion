package com.annot.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {

	
	@Test
	
	private void username() {

		String exp_username = "starc";
		String actual_username = "starc123";
		
		Assert.assertEquals(actual_username, exp_username);
		
		System.out.println("Asser validation");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
