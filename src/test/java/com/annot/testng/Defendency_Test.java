package com.annot.testng;

import org.testng.annotations.Test;

public class Defendency_Test {
	
	@Test
	private void Mobile() {

		System.out.println("Mobile");
		
	}
	
	@Test(dependsOnMethods = "Watch")
	private void offer() {

		System.out.println("Offer");
	}
	
	@Test
	private void Watch() {
		System.out.println("Watch");
		
	}
	
	
	

}
