package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configuration_loginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//a[@class='login']")
	private WebElement loginbtn  ;
	
	@FindBy(xpath ="//input[@id='email_create']")
	private WebElement email ;
	
	@FindBy( id="SubmitCreate")
	private WebElement submitbtn  ;
	
	@FindBy( xpath="(//input[@value='1'])[1]")
	private WebElement clickbtn  ;

	public Configuration_loginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getClickbtn() {
		return clickbtn;
	}
	
		
}