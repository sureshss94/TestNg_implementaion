package com.annot.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class launchoo {

	@Test
	@BeforeMethod

	private void browser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\March22_PB\\Driver\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
	}
	@Test
	@AfterMethod
	
	private void driver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\March22_PB\\Driver\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
     driver.get("http://www.fb.com");
	}

}
