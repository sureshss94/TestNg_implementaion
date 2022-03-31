package com.annot.testng;

import org.testng.annotations.Test;

public class Invocation_Concepts {

	
	@Test(priority= -1)
	private void browser_Launch() {

			System.out.println("Browser launch");
		
	}
	
	@Test(priority= 0)
	
	private void launch_Url() {
		System.out.println("Launch url");
	}
	
	@Test(priority=1,invocationCount = 4)
	
	private void refresh() {
		System.out.println("refresh");
	}
	
	
	
	
	
}
