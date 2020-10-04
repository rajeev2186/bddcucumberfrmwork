package cucum.toolqa.grp.pgfactory;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingcart_pagefactory {
	
	WebDriver driver;
	
	
	@FindBy(name= "removefromcart")
	WebElement check_removefromkart;
	
	@FindBy(name= "updatecart")
	WebElement btn_updatecart;
	
	
	@FindBy(name= "continueshopping")
	WebElement btn_continueshopping;
	
	@FindBy(xpath = "//a[@class='product-name']")
	WebElement check_productcart;
	
	public void removeitemcart()
	{
		check_removefromkart.click();
	}
	
	public void updateitemcart()
	{
		btn_updatecart.click();
	}
	
	
	public void continuetoshopping()
	{
		btn_continueshopping.click();
	}
	
	
	public shoppingcart_pagefactory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateemptycart(String Validationmessage)
	{
		assertEquals(Validationmessage, "Your Shopping Cart is empty!");
	}
	
	public void checkitemincart(String Productname)
	{
		assertEquals(Productname, "Computing and Internet");
	}
	
	

}
