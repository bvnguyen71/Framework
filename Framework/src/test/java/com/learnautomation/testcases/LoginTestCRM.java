package com.learnautomation.testcases;

import org.apache.poi.ss.usermodel.ExcelStyleDateFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass{
	
	
	@Test
	public void loginApp()
	{
		ExcelDataProvider excel=new ExcelDataProvider();
	
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
		Helper.captureScreenshot(driver);
		
		
	}
	
	


}
