package com.annot.testng;

import org.testng.annotations.Test;

public class priority_Concpets {

	@Test(priority = -1)
	private void User_Name() {
		System.out.println("username..");
	}
	
	@Test(priority = 0)
	private void Pass_Word() {
		System.out.println("password..");
	}
	
	@Test(priority = 1)
	
	private void Login() {
     System.out.println("login...");
	}
	
	
	
	
	
	
	
}
