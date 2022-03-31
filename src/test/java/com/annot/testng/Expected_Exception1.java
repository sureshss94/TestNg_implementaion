package com.annot.testng;

import org.testng.annotations.Test;

public class Expected_Exception1 {
	
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	
	private void Calculator() {
		
		int a= 10;
		
		System.out.println(a/2);
		
		System.out.println("output.....");
		
		
		
	}
	
	
	
	
	

}
