package com.annot.testng;

import org.testng.annotations.Test;

public class Timeout_Test {

	@Test(timeOut = 8000)
	
	private void browser_Launch() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("Browser launch");
		
		Thread.sleep(1000);
		
		System.out.println("url Launch");
		
		Thread.sleep(2000);
		
		System.out.println("Crendentials Entered");
		
		Thread.sleep(1000);
		
		System.out.println("next page");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}