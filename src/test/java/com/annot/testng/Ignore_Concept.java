package com.annot.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test(enabled = true)
	private void User_Name() {
		System.out.println("username..");
	}
	
	
	
	@Ignore
	private void Pass_Word() {
		System.out.println("password..");
	}
	
	
	
	
	@Test(enabled= false)
	private void Login() {
	     System.out.println("login...");
		}
		
	@Test(priority=1)
	private void Home_Page22() {
		// TODO Auto-generated method stub
		System.out.println("Homepage...");
	}
	
	
}
