package com.annot.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	
	@Test(dataProvider = "test_Data")
	
	private void adactin_Runner(String username,String password) {

		System.out.println("Username :"+username);
		System.out.println("Password :"+password);
		
	}
	
	@DataProvider
	
	private Object[][] test_Data() {
		
		return new Object[][] {
			
			
			{"iron man","sur56"},
			
			{"Smith" , "2345"},
			
			{"xmen" , "rtyugf"},
			
		};
			
			
		
	}
}	


