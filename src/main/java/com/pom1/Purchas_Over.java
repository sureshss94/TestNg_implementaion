package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchas_Over {
	public Purchas_Over(WebDriver driver2) {
		this.driver = driver2;
	PageFactory.initElements(driver, this);;	
	}

	public WebDriver driver;// null driver
	
	
	@FindBy (xpath ="//img[@height='98']")
	private WebElement moveto ;
	
	@FindBy (xpath ="(//a[@title='Proceed to checkout'])[2]")
	private WebElement movedown ;
	
	
	@FindBy ( name="processAddress")
	private WebElement Btn1 ;
	
	@FindBy ( id="cgv")
	private WebElement Btn2 ;
	
	@FindBy ( name ="processCarrier")
	private WebElement Btn3 ;
	
	@FindBy (xpath ="//a[@class='bankwire']")
	private WebElement Btn4;
	
	@FindBy (xpath ="(//button[@type='submit'])[2]")
	private WebElement move_click ;
	
	@FindBy (xpath ="//a[@class='logout']")
	private WebElement logout ;

	public WebElement getMoveto() {
		return moveto;
	}

	public WebElement getMovedown() {
		return movedown;
	}

	public WebElement getBtn1() {
		return Btn1;
	}

	public WebElement getBtn2() {
		return Btn2;
	}

	public WebElement getBtn3() {
		return Btn3;
	}

	public WebElement getBtn4() {
		return Btn4;
	}

	public WebElement getMove_click() {
		return move_click;
	}

	public WebElement getLogout() {
		return logout;
	}
	
}
