package com.annot.testng;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {
	
	
	@BeforeTest
	private void browser_Launch() {
		
		System.out.println("Browser launch..");
	}
	@BeforeSuite
	private void setOroperty() {
		
		System.out.println("Set Property..");
	}
	@BeforeClass
	private void getUrl() {

		System.out.println("Url..");
	}
	@BeforeMethod
	private void Sign_in() {

		System.out.println("Sign in..");
	}
	
	@Test
	private void women() {
		System.out.println("Women...");
	}
	@Test
	private void Men_A() {
		
		System.out.println("Men...");
	}
	@AfterMethod
	
	private void Sign_Out() {
		System.out.println("Sign Out..");

	}
	
	@Test
	private void Child() {
		System.out.println("child....");
	}
	
	@AfterSuite
	private void Delete_Allcookies() {
		System.out.println("Clear all cookies...");
	}
	
	@AfterTest
	private void Close() {
		// TODO Auto-generated method stub
		System.out.println("lose...");
	}
	
	@AfterClass
	private void Home_Page() {

		System.out.println("Home page view..");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	


