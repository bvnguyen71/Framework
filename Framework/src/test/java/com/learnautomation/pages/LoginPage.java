package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver; 
	
	public  LoginPage(WebDriver ldriver)
	{
		this.driver =ldriver;
	}
	
	@FindBy(name="email") WebElement email;
	@FindBy(name="password") WebElement pass;
	@FindBy(xpath="//*[text() = 'Login']") WebElement loginButton;

	public void loginToCRM(String usernameApplication, String passwordApplication)
	{
		
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		email.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
		
	}
	
}
