package com.learnautomation.testcases;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {

	@Test
	public void test1() throws InterruptedIOException {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tuan\\eclipse-workspace\\Framwork\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://freecrm.com/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.name("email")).sendKeys("bvnguyen71@yahoo.com");
			driver.findElement(By.name("password")).sendKeys("Abc@123456");
			driver.findElement(By.xpath("//*[text() = 'Login']")).click();
			driver.quit();
			
	}

}
