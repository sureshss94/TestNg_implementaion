package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configuration_Account {
	
	public WebDriver driver;
	
	@FindBy (xpath ="//input[@id='customer_firstname']")
	private WebElement  firstname ;
	
	@FindBy (xpath ="//input[@id='customer_lastname']")
	private WebElement lastname  ;
	
	@FindBy ( id="passwd")
	private WebElement pass  ;
	
	@FindBy ( id="days")
	private WebElement  day ;
	
	@FindBy (id ="months")
	private WebElement month  ;
	
	@FindBy ( id="years")
	private WebElement  year;
	
	@FindBy ( id="newsletter")
	private WebElement clickbtn ;
	
	@FindBy (id ="firstname")
	private WebElement fnmae1  ;
	@FindBy ( id="lastname")
	private WebElement  lname2 ;
	
	@FindBy ( id="company")
	private WebElement company ;
	
	@FindBy (id ="address1")
	private WebElement address ;
	

	@FindBy ( id="city")
	private WebElement city  ;
	
	@FindBy (xpath ="//select[@id='id_state']")
	private WebElement state  ;

	@FindBy ( id="postcode")
	private WebElement pincode  ;
	
	@FindBy (xpath ="//select[@id='id_country']")
	private WebElement country ;

	@FindBy ( xpath="//input[@id='phone_mobile']")
	private WebElement mobile  ;
	
	@FindBy (id ="alias")
	private WebElement as  ;
	
	@FindBy(id="submitAccount")
	private WebElement submitbtn;
	
	@FindBy (xpath = "//a[@class='logout']")
	private WebElement logoutbtn;

	public Configuration_Account(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getClickbtn() {
		return clickbtn;
	}

	public WebElement getFnmae1() {
		return fnmae1;
	}

	public WebElement getLname2() {
		return lname2;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAs() {
		return as;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
