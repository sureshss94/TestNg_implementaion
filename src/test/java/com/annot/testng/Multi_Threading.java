package com.annot.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Multi_Threading {

	@Test
	private void username() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\March22_PB\\Driver\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		System.out.println("user name");
	}

	@Test
	private void password() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\March22_PB\\Driver\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");


		System.out.println("password");
	}

}
