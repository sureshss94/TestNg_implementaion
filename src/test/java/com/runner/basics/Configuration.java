package com.runner.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base.Base_Class;
import com.helper.manager.Configuration_Pom;
import com.pom1.Configuration_Account;
import com.pom1.Configuration_loginPage;

public class Configuration extends Base_Class {

	public static WebDriver driver = browser_Configuration("chrome");
	public static Configuration_Pom pom = new Configuration_Pom(driver);
	
	public static void main(String[] args) throws Exception {

		getUrl("http://automationpractice.com/index.php");

		clickonElement("click", pom.get_instance_login().getLoginbtn());
		waitbrowser("wait", 10);

		// email id enter
		inputValueElement(pom.get_instance_login().getEmail(), "sureshsow2@gmail.com");
		clickonElement("click", pom.get_instance_login().getSubmitbtn());
		waitbrowser("wait", 10);
		clickonElement("click", pom.get_instance_login().getClickbtn());

		// Account registration
		inputValueElement(pom.get_instance_account().getFirstname(), "suresh");
		inputValueElement(pom.get_instance_account().getLastname(), "mech");
		inputValueElement(pom.get_instance_account().getPass(), "abcd2345");

		dropdown("byvalue", pom.get_instance_account().getDay(), "23");
		dropdown("byindex", pom.get_instance_account().getMonth(), "9");
		dropdown("byvalue", pom.get_instance_account().getYear(), "1994");
		clickonElement("click", pom.get_instance_account().getClickbtn());

		inputValueElement(pom.get_instance_account().getFnmae1(), "suresh");
		inputValueElement(pom.get_instance_account().getLname2(), "S");
		inputValueElement(pom.get_instance_account().getCompany(), "Pyung hwa india pvt ltd");
		inputValueElement(pom.get_instance_account().getAddress(), "chidambaram , cuddalore district");
		inputValueElement(pom.get_instance_account().getCity(), "chidambaram");

		dropdown("bytext", pom.get_instance_account().getState(), "Indiana");
		inputValueElement(pom.get_instance_account().getPincode(), "00000");

		dropdown("byvalue", pom.get_instance_account().getCountry(), "21");
		inputValueElement(pom.get_instance_account().getMobile(), "9787419103");
		clickonElement("clear", pom.get_instance_account().getAs());
		inputValueElement(pom.get_instance_account().getAs(), "cudalore");

		waitbrowser("longwait", 3000);

		clickonElement("click", pom.get_instance_account().getClickbtn());

		waitbrowser("wait", 10);

		clickonElement("click", pom.get_instance_account().getLogoutbtn());
	}

}
