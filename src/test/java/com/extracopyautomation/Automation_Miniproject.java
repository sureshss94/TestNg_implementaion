package com.extracopyautomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.log4j.logger.Property_Configuration;

public class Automation_Miniproject extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");

		
		@BeforeClass
		private void url_launch() {
			driver.get("http://automationpractice.com/index.php");

			driver.manage().window().maximize();
			// select by desire size and login
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@BeforeMethod
		private void log_in() {
			// TODO Auto-generated method stub

		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("sureshsow2@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("abcd2345");
		driver.findElement(By.id("SubmitLogin")).click();
		}
		@Test(priority = 0)
		private void tshirt_() throws IOException {
			// TODO Auto-generated method stub

		
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		
		WebElement move = driver.findElement(By.xpath("//img[@width='250']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(move);
		ac.click(move).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// ADD to cart
		WebElement frame = driver.findElement(By.xpath("//iframe[@frameborder='0']"));

		driver.switchTo().frame(frame);
		WebElement qty = driver.findElement(By.name("qty"));
		qty.clear();
		qty.sendKeys("2");
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));

		Select s = new Select(size);
		s.selectByIndex(1);
		driver.findElement(By.name("Blue")).click();
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

		// screenshot from order
		WebElement moving = driver.findElement(By.xpath("//img[@height='98']"));
		ac.moveToElement(moving).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\suresh\\Selenium\\Screenshot//proceed.png");
		FileUtils.copyFile(source, dest);

		WebElement move1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		ac.moveToElement(move1).build().perform();
		move1.click();

		driver.findElement(By.name("processAddress")).click();

		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();

		// purchase finalize
		WebElement click = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		ac.moveToElement(click).build().perform();
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\suresh\\Selenium\\Screenshot//confirm.png");
		FileUtils.copyFile(screenshot, desti);
		ac.click(click).build().perform();

		File screens = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\suresh\\Selenium\\Screenshot//purchase.png");
		FileUtils.copyFile(screens, destination);
		}
		
		@AfterMethod
		private void log_out() {

		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		
		}
		
		// Women purchase
		/*WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		clickonElement("click", login);
		WebElement moveto = driver.findElement(By.xpath("(//form[@class='box'])[2]"));
		Actionclass("moveto", moveto);
		
		driver.findElement(By.id("email")).sendKeys("sureshsow2@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("abcd2345");
		driver.findElement(By.id("SubmitLogin")).click();*/
		@Test(priority = 1)
		private void Women() {
			// TODO Auto-generated method stub

		
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[4]")).click();
	driver.findElement(By.xpath("//img[@title='Printed Dress']")).click();
	
	WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(frame2);
	
	WebElement qty2 = driver.findElement(By.name("qty"));
		qty2.clear();
		qty2.sendKeys("2");
		WebElement element = driver.findElement(By.xpath("//select[@name='group_1']"));
		dropdown("byvalue", element, "2");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		driver.findElement(By.name("processAddress")).click();
		driver.findElement(By.name("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		}
		
	//	driver.findElement(By.xpath("//a[@class='logout']")).click();
		
	//	System.out.println("Women....");
		//Dresses purchase
		
		
	/*	WebElement login2 = driver.findElement(By.xpath("//a[@class='login']"));
		clickonElement("click", login2);
		
		
		driver.findElement(By.id("email")).sendKeys("sureshsow2@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("abcd2345");
		driver.findElement(By.id("SubmitLogin")).click();*/
		@Test(priority= -1)
		private void dress_method() throws InterruptedException {

		
		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='layered_category_10']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Printed Dress']")).click();
		
		
		WebElement find = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));   		
		frameswitchTo("singleframe", find);
		
		WebElement qty3 = driver.findElement(By.name("qty"));
		qty3.clear();
		qty3.sendKeys("2");
		WebElement element2 = driver.findElement(By.xpath("//select[@name='group_1']"));
		dropdown("byvalue", element2, "2");
		driver.findElement(By.name("Submit")).click();
		frameswitchTo("defaultcontent", element2);
		
		

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		driver.findElement(By.name("processAddress")).click();
		driver.findElement(By.name("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		}
		//driver.findElement(By.xpath("//a[@class='logout']")).click();
		
		
		
		
		
		
		
		
		

		
		

	}
