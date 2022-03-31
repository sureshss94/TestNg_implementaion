package com.helper.manager;

import org.openqa.selenium.WebDriver;

import com.pom1.Configuration_Account;
import com.pom1.Configuration_loginPage;

public class Configuration_Pom {
	public WebDriver driver;
	
	
	private  Configuration_loginPage login;
	private  Configuration_Account account;
	
	public Configuration_Pom(WebDriver driver2) {
		this.driver = driver2;
		
	}
	public Configuration_loginPage get_instance_login() {
		if (login==null) {
			login = new Configuration_loginPage(driver);
			
		}
		return login;
	
	
	}
	public Configuration_Account get_instance_account() {
		
		if (account==null) {
			account = new Configuration_Account(driver);
			
		}
		return account; 
		
		
	}
}


