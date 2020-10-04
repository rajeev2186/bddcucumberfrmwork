package cucum.toolqa.grp.pgfactory;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class books_pagefactory {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//h1[contains(text(),'Books')]")
	WebElement title_book;
	
	@FindBy(xpath = "//div[@class='master-wrapper-content']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	WebElement btn_addtocart;
	
	
	public books_pagefactory(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void validatebookpage(String booktitile)
	{
		assertEquals(booktitile, "Books");
		System.out.println(booktitile);
	}
	
	public void AddbooktoCart()
	{
		
		
		btn_addtocart.click();
	}
	

}
