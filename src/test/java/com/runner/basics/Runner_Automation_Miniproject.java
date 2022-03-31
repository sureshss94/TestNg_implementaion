package com.runner.basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.base.Base_Class;
import com.configuration.helper.File_Reader_Manager;
import com.helper.manager.Page_Objectmanager1;
import com.pom1.Automation_login;
import com.pom1.Purchas_Over;

public class Runner_Automation_Miniproject extends Base_Class {

	public static WebDriver driver = browser_Configuration("chrome");
	public static Page_Objectmanager1 pom = new Page_Objectmanager1(driver);
	
	static Logger log = Logger.getLogger(Runner_Automation_Miniproject.class);

	public static void main(String[] args) throws Exception {
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Url();
		
		getUrl(url);
		
		waitbrowser("wait", 10);
		// select by desire size and login

		log.info("Url launch");
		
		clickonElement("click", pom.get_instance_Addtocart().getLogin_btn());

		inputValueElement(pom.get_instance_Addtocart().getEmail(),
				test_CaseData("C:\\Users\\suresh\\March22_PB\\Test case.xlsx", 0, 24, 5));

		inputValueElement(pom.get_instance_Addtocart().getPassword(),
				test_CaseData("C:\\Users\\suresh\\March22_PB\\Test case.xlsx", 0, 25, 5));

		clickonElement("click", pom.get_instance_Addtocart().getLogin_btn1());
		clickonElement("click", pom.get_instance_Addtocart().getTshirtbtn());
		clickonElement("click", pom.get_instance_Addtocart().getCheckbox1());
		clickonElement("click", pom.get_instance_Addtocart().getBtn());
		clickonElement("click", pom.get_instance_Addtocart().getCheckbox2());
		Actionclass("moveto", pom.get_instance_Addtocart().getImgclick());
		Actionclass("clickon", pom.get_instance_Addtocart().getImgclick());
		
		log.info("go to addtocart ");
		// ADD to cart
		frameswitchTo("singleframe", pom.get_instance_Addtocart().getFramein());
		clickonElement("clear", pom.get_instance_Addtocart().getQuantity());
		inputValueElement(pom.get_instance_Addtocart().getQuantity(), "2");

		dropdown("byindex", pom.get_instance_Addtocart().getSize(), "1");
		clickonElement("click", pom.get_instance_Addtocart().getColour());
		clickonElement("click", pom.get_instance_Addtocart().getSubmitbtn());
		frameswitchTo("defaultcontent", pom.get_instance_Addtocart().getSubmitbtn());
		clickonElement("click", pom.get_instance_Addtocart().getCheckout());

		// screenshot from order
		Actionclass("moveto", pom.get_instance_over().getMoveto());
		waitbrowser("wait", 10);

		TakesScreenshot("C:\\Users\\suresh\\March22_PB\\Screenshot//proceed.png");

		Actionclass("moveto", pom.get_instance_over().getMovedown());
		Actionclass("clickon", pom.get_instance_over().getMovedown());
		clickonElement("click", pom.get_instance_over().getBtn1());
		clickonElement("click", pom.get_instance_over().getBtn2());
		clickonElement("click", pom.get_instance_over().getBtn3());
		clickonElement("click", pom.get_instance_over().getBtn4());
		
		log.info("purchase page");
		// purchase finalize
		Actionclass("moveto", pom.get_instance_over().getMove_click());

		TakesScreenshot("C:\\Users\\suresh\\March22_PB\\Screenshot//purchase.png");
		clickonElement("click", pom.get_instance_over().getMove_click());
		TakesScreenshot("C:\\Users\\suresh\\March22_PB\\Screenshot//purchase2.png");

		
		log.info("purchase over");
		
		clickonElement("click", pom.get_instance_over().getLogout());
	}
}