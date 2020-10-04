package cucum.toolqa.grp.pgfactory;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_pagefactory {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//h2[@class='topic-html-content-header']")
	WebElement HomepageTitle;
	
	@FindBy(xpath="//li[@class='inactive']//a[contains(text(),'Books')]")
	WebElement Link_BooksLink;
	
	@FindBy(xpath="//li[@class='inactive']//a[contains(text(),'Computers')]")
	WebElement Link_ComputersLink;
	
	@FindBy(xpath="//li[@class='inactive']//a[contains(text(),'Electronics')]")
	WebElement Link_ElectronicsLink;
	
	
	@FindBy(xpath="//li[@class='inactive']//a[contains(text(),'Jewelry')]")
	WebElement Link_JewelleysLink;
	
	
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	WebElement Link_Shoppingcart;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement Link_Account;
	
	
	
	public void navigation_book()
	{
		Link_BooksLink.click();
	}
	
	public void navigation_Computers()
	{
		Link_ComputersLink.click();
	}
	
	public void navigation_Electronics()
	{
		Link_ElectronicsLink.click();
	}
	public void navigation_Jewellery()
	{
		Link_JewelleysLink.click();
	}
	public void navigation_Shoppingcart()
	{
		Link_Shoppingcart.click();
	}
	
	public void navigation_Account() throws Exception
	{
	
		Link_Account.click();
	}
	
	public void validatehomepage(String Welcomemsg)
	{
	assertEquals(Welcomemsg, "Welcome to our store");	
	}
	
	public home_pagefactory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
