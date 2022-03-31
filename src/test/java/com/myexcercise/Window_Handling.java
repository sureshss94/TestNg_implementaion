package com.myexcercise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.base.Base2;

public class Window_Handling extends Base2 {
	public static WebDriver driver;

public static void main(String[] args) throws Exception {
	
		
	driver = browser_Configuration("chrome");
	getUrl("https://amazon.in/");   
	
		WebElement click = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		Actionclass("rightclick", click);
		
				
		
			robotactions("keypress")	;
			robotactions("keyrelease");
			robotactions("keyenter");
			robotactions("keyenter1");
		
		
		WebElement newtab = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		
		
		Actionclass("rightclick", newtab);
		
		robotactions("keypress")	;
		robotactions("keyrelease");
		robotactions("keyenter");
		robotactions("keyenter1");
		
		windowhandle("handleswindow");
		
		
				
			}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


