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
import org.openqa.selenium.support.ui.Select;

import com.base.Base_Class;
import com.configuration.helper.File_Reader_Manager;
import com.helper.manager.Page_Object_Manager;
import com.log4j.logger.Property_Configuration;
import com.pom.Adactin_1stpage;
import com.pom.Booking_Page;
import com.pom.Login_Page;

public class Runner_Class_Adactin extends Base_Class {

	public static WebDriver driver = browser_Configuration("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	static Logger log = Logger.getLogger(Runner_Class_Adactin.class);
	
	public static void main(String[] args) throws Exception {
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = File_Reader_Manager.get_Instance_FRM().get_Instance_Adaction().get_Config_Adactin_Url();
		getUrl(url);

		// login

		inputValueElement(pom.get_instance_login().getUsernmae(),
				test_CaseData("C:\\Users\\suresh\\March22_PB\\Test case.xlsx", 1, 1, 5));
		inputValueElement(pom.get_instance_login().getPass(),
				test_CaseData("C:\\Users\\suresh\\March22_PB\\Test case.xlsx", 1, 2, 5));
		clickonElement("click", pom.get_instance_login().getLogin());
		waitbrowser("wait", 10);
		
		log.info("Url Launch");
		// firstpage

		dropdown("byvalue", pom.get_instance_firstpage().getLocation(), "Melbourne");

		dropdown("byindex", pom.get_instance_firstpage().getHotels(), "2");

		dropdown("bytext", pom.get_instance_firstpage().getRoomtype(), "Standard");

		dropdown("byvalue", pom.get_instance_firstpage().getRoomnos(), "2");

		clickonElement("clear", pom.get_instance_firstpage().getDatein());
		inputValueElement(pom.get_instance_firstpage().getDatein(),
				test_CaseData("C:\\Users\\suresh\\March22_PB\\Test case.xlsx", 1, 8, 5));

		clickonElement("clear", pom.get_instance_firstpage().getDateout());
		inputValueElement(pom.get_instance_firstpage().getDateout(),
				test_CaseData("C:\\Users\\suresh\\March22_PB\\Test case.xlsx", 1, 9, 5));

		dropdown("byvalue", pom.get_instance_firstpage().getAdult(), "1");
		dropdown("byindex", pom.get_instance_firstpage().getChild(), "1");

		clickonElement("click", pom.get_instance_firstpage().getSubmit());
		// 2nd page
		clickonElement("click", pom.get_instance_firstpage().getSelect());
		clickonElement("click", pom.get_instance_firstpage().getSelect1());
		log.info("Crendtials Entered in field");
		
		// booking page
		inputValueElement(pom.get_instance_booking().getFname(),
				test_CaseData("C:\\Users\\suresh\\March22_PB\\Test case.xlsx", 1, 15, 5));
		inputValueElement(pom.get_instance_booking().getLname(),
				test_CaseData("C:\\Users\\suresh\\March22_PB\\Test case.xlsx", 1, 16, 5));
		inputValueElement(pom.get_instance_booking().getAddress(),
				test_CaseData("C:\\Users\\suresh\\March22_PB\\Test case.xlsx", 1, 17, 5));
		inputValueElement(pom.get_instance_booking().getCardnumber(),
				test_CaseData("C:\\\\Users\\\\suresh\\\\March22_PB\\\\Test case.xlsx", 1, 18, 5));
		dropdown("byindex", pom.get_instance_booking().getCardtype(), "3");

		dropdown("byvalue", pom.get_instance_booking().getExpmonth(), "3");
		dropdown("bytext", pom.get_instance_booking().getExpyear(), "2022");
		inputValueElement(pom.get_instance_booking().getCvvnum(),
				test_CaseData("C:\\Users\\suresh\\March22_PB\\Test case.xlsx", 1, 21, 5));
		clickonElement("click", pom.get_instance_booking().getBooknow());

		log.info("Booking page");
		waitbrowser("longwait", 5000);
		// screenshot
		TakesScreenshot("C:\\Users\\suresh\\March22_PB\\Screenshot//booking.png");

		clickonElement("click", pom.get_instance_booking().getLogout());

		// Driver_operations("close");

	}

}
