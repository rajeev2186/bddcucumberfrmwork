package cucum.toolqa.grp.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ConfigdataProvider.ConfigFileReader;
import ConfigdataProvider.fileReaderManager;
import cucum.toolqa.grp.pgfactory.account_pagefactory;
import cucum.toolqa.grp.pgfactory.home_pagefactory;
import cucum.toolqa.grp.pgfactory.login_pagefactory;
import cucum.toolqa.grp.pgobjmanager.WebDriverManager;
import cucum.toolqa.grp.pgobjmanager.pagemanagers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adddeleteaddress {
	
//	WebDriver driver;
//	ConfigFileReader configfilereader;
//	login_pagefactory loginpage;
//	home_pagefactory homepage;
//	account_pagefactory accountpage;
//	pagemanagers pagemanage; 
//	WebDriverManager webDriverManager;
//	
//	@Before
//	public void LaunchWebshop()
//	{
//		 
//		
//		webDriverManager = new WebDriverManager();
//		driver = webDriverManager.getDriver();
//		
//		
//		 pagemanage = new pagemanagers(driver);
//	
//		 loginpage = pagemanage.getloginpage();
//
//		 loginpage.loginApp(fileReaderManager.getInstance().getConfigReader().getApplicationUsername(), fileReaderManager.getInstance().getConfigReader().getApplicationPassword());
//		 
//		 String Hompage = driver.findElement(By.xpath("//h2[@class='topic-html-content-header']")).getText();
//		 homepage = pagemanage.gethomeage();
//		 homepage.validatehomepage(Hompage);
//
//	}
//	
//
//
//    @When("^Clicks on Account Details from top menu$")
//    public void clicks_on_account_details_from_top_menu() throws Throwable {
//    	
//    	homepage.navigation_Shoppingcart();
//    	
//    	//System.out.println("Clicks on Account Details from top menu");
//        
//    }
//
//    @When("^User Clicks on Adddress link$")
//    public void user_clicks_on_adddress_link() throws Throwable {
//    	
//    	accountpage.NavigateAddress();
//    	
//    	System.out.println("Clicks on Account Details from top menu");
//       
//    }
//
//    @When("^User Click on Add new$")
//    public void user_click_on_add_new() throws Throwable {
//    	
//    	accountpage.AdduserAddress();
//    	
//    	System.out.println("Clicks on Account Details from top menu");
//       
//    }
//
//    @When("^User Clicks on Delete button$")
//    public void user_clicks_on_delete_button() throws Throwable {
//    	
//    	accountpage.DeleteuserAddress();
//    	
//    	System.out.println("Clicks on Account Details from top menu");
//       
//    }
//
//    @Then("^User is navigated to My account section$")
//    public void user_is_navigated_to_my_account_section() throws Throwable {
//    	
//    	
//    	String Accpagetitle = driver.findElement(By.xpath("//h1[contains(text(),'My account - Customer info')]")).getText();
//    	System.out.println(Accpagetitle);
//    	
//    	accountpage.ValidateMyaccountPage(Accpagetitle);
//    	
//    	System.out.println("Clicks on Account Details from top menu");
//        
//    }
//
//    @Then("^User is navigated to My account Addresses section$")
//    public void user_is_navigated_to_my_account_addresses_section() throws Throwable {
//    	
//    	String Addpagetitle = driver.findElement(By.xpath("//h1[contains(text(),'My account - Addresses')]")).getText();
//    	accountpage.ValidateAddressPage(Addpagetitle);
//        
//    }
//
//    @Then("^User Details are added$")
//    public void user_details_are_added() throws Throwable {
//    	String Addressinfo =  driver.findElement(By.xpath("//strong[contains(text(),'ABCD PQRS')]")).getText();
//    	
//    	accountpage.CheckAddRessAdded(Addressinfo);
//    	
//    	System.out.println("Clicks on Account Details from top menu");
//      
//    }
//
//    @Then("^User Address is deleted$")
//    public void user_address_is_deleted() throws Throwable {
//    	String Noaddress= driver.findElement(By.xpath("//div[@class='address-list']")).getText();
//    	accountpage.ValidateNoAddressExist(Noaddress);
//    	System.out.println("User Address is deleted");
//       
//    }
//
//    @And("^Enter User Details$")
//    public void enter_user_details() throws Throwable {
//    	accountpage.AdduserAddress();
//    	System.out.println("Enter User Details");
//       
//    }
//
//   
//
//
//    
//    @After
//    public void closebrowser()
//    
//    {
//    	webDriverManager.closeDriver();
//    	//driver.close();
//    }

}
