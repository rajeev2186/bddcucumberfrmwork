package cucum.toolqa.grp.pgfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pagefactory {
	
	WebDriver driver;
	
	
	@FindBy(id="Email")
	WebElement txt_Email;
	
	
	@FindBy(id="Password")
	WebElement txt_Password;
	
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement btn_login;
	
	
	public void loginApp(String Email, String Password)
	{
		txt_Email.sendKeys(Email);
		txt_Password.sendKeys(Password);
		btn_login.click();
	}
	
	
	public login_pagefactory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
