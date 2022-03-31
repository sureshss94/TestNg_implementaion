package com.helper.manager;

import org.openqa.selenium.WebDriver;

import com.pom1.Automation_login;
import com.pom1.Purchas_Over;

public class Page_Objectmanager1 {
	
	public WebDriver driver;
	
	private Automation_login Addtocart;
	private Purchas_Over over;
	
	public Page_Objectmanager1(WebDriver driver2) {
		this.driver	=driver2;
	}
	public Purchas_Over get_instance_over() {
		
		if (over==null) {
		over = new Purchas_Over(driver);
		}
		
		
		return over;
		
	}
	public Automation_login get_instance_Addtocart() {
		
		if (Addtocart==null) {
			Addtocart = new Automation_login(driver);
		}
		
		return Addtocart;
		
	}
	

}
