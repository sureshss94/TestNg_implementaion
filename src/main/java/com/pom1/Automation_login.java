package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_login {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement login_btn ;
	
	@FindBy(id = "email")
	private WebElement email ;
	
	@FindBy(id = "passwd")
	private WebElement  password;
	
	@FindBy(id = "SubmitLogin")
	private WebElement login_btn1;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tshirtbtn ;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkbox1 ;
	
	@FindBy(xpath = "(//input[@type='button'])[2]")
	private WebElement Btn;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	private WebElement checkbox2 ;
	
	@FindBy(xpath = "//img[@width='250']")
	private WebElement imgclick ;
	
	@FindBy(xpath = "//iframe[@frameborder='0']")
	private WebElement framein ;
	
	@FindBy(name = "qty")
	private WebElement quantity ;
	
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size ;
	
	@FindBy(name = "Blue")
	private WebElement colour ;
	
	@FindBy(name = "Submit")
	private WebElement submitbtn ;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkout ;
	
	public Automation_login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogin_btn() {
		return login_btn;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin_btn1() {
		return login_btn1;
	}
	public WebElement getTshirtbtn() {
		return tshirtbtn;
	}
	public WebElement getCheckbox1() {
		return checkbox1;
	}
	public WebElement getBtn() {
		return Btn;
	}
	public WebElement getCheckbox2() {
		return checkbox2;
	}
	public WebElement getImgclick() {
		return imgclick;
	}
	public WebElement getFramein() {
		return framein;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getColour() {
		return colour;
	}
	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	

}
