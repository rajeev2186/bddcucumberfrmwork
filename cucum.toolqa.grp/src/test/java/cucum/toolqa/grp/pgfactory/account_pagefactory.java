package cucum.toolqa.grp.pgfactory;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testDataTypes.Customer;

public class account_pagefactory {
	Customer customer;
	
	
	
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Customer info')]")
	WebElement link_Customerinfo;
	
	@FindBy(xpath="//a[@class='inactive'][contains(text(),'Addresses')]")
	WebElement link_Addresses;
	
	@FindBy(xpath="//h1[contains(text(),'My account - Addresses')]")
	WebElement title_Addresses;
	
	@FindBy(xpath="//input[@class='button-1 add-address-button']")
	WebElement btn_AddNew;
	@FindBy(xpath="//input[@id='Address_FirstName']")
	WebElement txt_FirstName;
	@FindBy(xpath="//input[@id='Address_LastName']")
	WebElement txt_LastName;
	@FindBy(xpath="//input[@id='Address_Email']")
	WebElement txt_AddressEmail;
	@FindBy(xpath="//input[@id='Address_Company']")
	WebElement txt_AddressCompany;
	@FindBy(xpath="//select[@id='Address_CountryId']")
	WebElement txt_AddressCountryId;
	@FindBy(xpath="//select[@id='Address_StateProvinceId']")
	WebElement txt_StateProvinceId;
	@FindBy(xpath="//input[@id='Address_City']")
	WebElement txt_Address_City;
	@FindBy(xpath="//input[@id='Address_Address1']")
	WebElement txt_Address_Address1;
	@FindBy(xpath="//input[@id='Address_Address2']")
	WebElement txt_Address_Address2;
	@FindBy(xpath="//input[@id='Address_ZipPostalCode']")
	WebElement txt_ZipPostalCode;
	@FindBy(xpath="//input[@id='Address_PhoneNumber']")
	WebElement txt_Address_PhoneNumber;
	@FindBy(xpath="//input[@id='Address_FaxNumber']")
	WebElement txt_Address_FaxNumber;
	@FindBy(xpath="//input[@class='button-1 save-address-button']")
	WebElement btn_Address_Save;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/input[2]")
	WebElement btn_Address_Delete;
	@FindBy(xpath="//div[@class='address-list']")
	WebElement title_addresslist;
	
	
	public void AdduserAddress()
	{
		
		//Customer customer;
		//System.out.println(customer.firstName);
		
		txt_FirstName.sendKeys("ABCD");
		//txt_FirstName.sendKeys(customer.firstName);
		txt_LastName.sendKeys("PQRS");
		//txt_LastName.sendKeys(customer.lastName);
		txt_AddressEmail.sendKeys("ABC@test.com");
		txt_AddressCompany.sendKeys("XYZ");
		Select Country =  new Select(txt_AddressCountryId);
		Country.selectByVisibleText("United States");
		Select State =  new Select(txt_StateProvinceId);
		State.selectByVisibleText("Alaska");
		txt_Address_City.sendKeys("BLR");
		txt_Address_Address1.sendKeys("XXXXX");
		//txt_Address_Address1.sendKeys(customer.address.streetAddress);
		txt_Address_Address2.sendKeys("YYYYY");
		txt_ZipPostalCode.sendKeys("12345");
		txt_Address_PhoneNumber.sendKeys("000000000000");
		btn_Address_Save.click();
		
	}
	
	
	
	public void addnewaddress()
	{
		btn_AddNew.click();
	}

	public void DeleteuserAddress() throws Exception
	{

		btn_Address_Delete.click();

		
	}

	public void ValidateNoAddressExist(String Noaddressmessage)
	{
		Noaddressmessage = title_addresslist.getText();
		assertEquals(Noaddressmessage, "No addresses");
	
	}


	public void NavigateAddress()
	{
		
		link_Addresses.click();
	}
	
	public void ValidateAddressPage(String AddressPage)
	{
		
	assertEquals(AddressPage, "My account - Addresses");
	}
	
	public void ValidateMyaccountPage(String CustomerPage)
	{
		
	assertEquals(CustomerPage, "My account - Customer info");
	}
	
	
	
	public void CheckAddRessAdded(String AddressDetails)
	{
		
	assertEquals(AddressDetails, "ABCD PQRS");
	}
	
	public account_pagefactory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
