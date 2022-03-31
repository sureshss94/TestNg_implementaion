package com.myexcercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base.Base2;

public class Multiple_Dropdown extends Base2 {
	public static WebDriver driver;

	public static void main(String[] args) {

		driver = browser_Configuration("chrome");
		getUrl("http://www.leafground.com/");

		WebElement click = driver.findElement(By.xpath("//img[@alt='ListBox']"));
		clickonElement("click", click);

		// single dropdown exercise on same page
		WebElement byindx = driver.findElement(By.id("dropdown1"));
		dropdown("byindex", byindx, "1");

		WebElement BYtext = driver.findElement(By.xpath("(//select)[2]"));
		dropdown("bytext", BYtext, "Appium");

		WebElement byvalue = driver.findElement(By.id("dropdown3"));
		dropdown("byvalue", byvalue, "1");

		System.out.println("Get num of options......");

		WebElement getnum = driver.findElement(By.xpath("//select[@class='dropdown']"));
		multidropdown("getoptions", getnum);

		driver.findElement(By.xpath("(//select)[5]")).sendKeys("Appium");
		System.out.println();

		System.out.println("is muliple dropdown....");

		// multiple dropdown
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		multidropdown("ismultiple", multi);
		dropdown("byindex", multi, "2");
		dropdown("bytext", multi, "UFT/QTP");

		dropdown("byvalue", multi, "4");
		dropdown("byvalue", multi, "3");

		System.out.println();

		System.out.println("get all options");

		multidropdown("getoptions", multi);

		System.out.println();

		System.out.println("getselected options.....");

		multidropdown("getselected", multi);

		Driver_operations("close");
		// s6.deselectAll();

	}

}
