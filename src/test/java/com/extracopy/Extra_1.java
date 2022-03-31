package com.extracopy;

import org.openqa.selenium.WebDriver;

import com.base.Extracopy;
import com.helper.manager.Page_Object_Manager;

public class Extra_1 extends Extracopy {
	
	public static WebDriver driver = browser_Configuration("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Exception {

		getUrl("http://adactinhotelapp.com/");

		// login
		
		inputValueElement(pom.get_instance_login().getUsernmae(), 1, 1,5);
		inputValueElement(pom.get_instance_login().getPass(), 1, 2,5);
		//inputValueElement(pom.get_instance_login().getUsernmae(), "Sureshjava");
		//inputValueElement(pom.get_instance_login().getPass(), "IEOQU8");
		clickonElement("click", pom.get_instance_login().getLogin());
		waitbrowser("wait", 10);

}
}