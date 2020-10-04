package cucum.toolqa.grp.stepdef;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConfigdataProvider.ConfigFileReader;
import ConfigdataProvider.fileReaderManager;
import cucum.toolqa.grp.pgfactory.account_pagefactory;
import cucum.toolqa.grp.pgfactory.books_pagefactory;
import cucum.toolqa.grp.pgfactory.home_pagefactory;
import cucum.toolqa.grp.pgfactory.login_pagefactory;
import cucum.toolqa.grp.pgfactory.shoppingcart_pagefactory;
import cucum.toolqa.grp.pgobjmanager.WebDriverManager;
import cucum.toolqa.grp.pgobjmanager.pagemanagers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import testDataTypes.Customer;

public class adddeleteitemtocart {
	
	WebDriver driver;
	ConfigFileReader configfilereader;
	
	login_pagefactory loginpage;
	home_pagefactory homepage;
	books_pagefactory bookpage;
	shoppingcart_pagefactory shoppingcartpage;
	pagemanagers pagemanage; 
	WebDriverManager webDriverManager;
	account_pagefactory accountpage;
	
	@Step("Launch Browser and Login to Application")
	@Before
	public void LaunchWebshop()
	{

		
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		

		 
		 pagemanage = new pagemanagers(driver);
	
		 loginpage = pagemanage.getloginpage();

		 loginpage.loginApp(fileReaderManager.getInstance().getConfigReader().getApplicationUsername(), fileReaderManager.getInstance().getConfigReader().getApplicationPassword());
		 homepage = pagemanage.gethomeage();

	}
	
	
	 @Given("^User is Dashboard Page$")
	    public void when_user_is_dashboard_page() throws Throwable {
		 
		
		 String Hompage = driver.findElement(By.xpath("//h2[@class='topic-html-content-header']")).getText();
		// homepage = pagemanage.gethomeage();
		 homepage.validatehomepage(Hompage);
		 

	   
	    }

	    @When("^User Clicks Books Menu$")
	    public void user_clicks_books_menu() throws Throwable {
	    	
			homepage.navigation_book(); 
			
	    	
	    }

	    @When("^User Add Computing and Internet Book to Cart$")
	    public void user_add_computing_and_internet_book_to_cart() throws Throwable {
	    	

	    	
	    	
	    	bookpage.AddbooktoCart();

	    	
	    }

	    @When("^User clicks on Remove Checkbox$")
	    public void user_clicks_on_remove_checkbox() throws Throwable {
	    	
	    	
	    	shoppingcartpage.removeitemcart();

	       
	    }

	    @Then("^User is Navigated to Books Main page$")
	    public void user_is_navigated_to_books_main_page() throws Throwable {
	    	
	    	 String Bookspage = driver.findElement(By.xpath("//h1[contains(text(),'Books')]")).getText();
	    	 bookpage = pagemanage.getbookpage();
	    	 bookpage.validatebookpage(Bookspage);

	       
	    }

	    @Then("^Computing and Internet is displayed in the shopping cart$")
	    public void computing_and_internet_is_displayed_in_the_shopping_cart() throws Throwable {
	    	
	    	shoppingcartpage = pagemanage.getshoppingcartpage();
	    	String shoppingcart = driver.findElement(By.xpath("//a[@class='product-name']")).getText();
	    	System.out.println(shoppingcart);
	    	shoppingcartpage.checkitemincart(shoppingcart);
	    
	    }

	    @Then("^Shopping cart is empty$")
	    public void shopping_cart_is_empty() throws Throwable {
	    	
	    	String emptyshoppingcart = driver.findElement(By.xpath("//div[@class='order-summary-content']")).getText();
	    	shoppingcartpage.validateemptycart(emptyshoppingcart);

	       
	    }

	    @And("^Clicks on Shopping Cart option from Top Menu$")
	    public void clicks_on_shopping_cart_option_from_top_menu() throws Throwable {
	    	
	    	homepage.navigation_Shoppingcart();

	    }

	    @And("^Clicks on Update Shopping cart$")
	    public void clicks_on_update_shopping_cart() throws Throwable {
	    	shoppingcartpage.updateitemcart();

	    }
	    
	    

	    @When("^Clicks on Account Details from top menu$")
	    public void clicks_on_account_details_from_top_menu() throws Throwable {
	    	System.out.println("I am here");
	    	
	    	
	    	homepage.navigation_Account();
	    	
	    	//System.out.println("Clicks on Account Details from top menu");
	        
	    }

	    @When("^User Clicks on Adddress link$")
	    public void user_clicks_on_adddress_link() throws Throwable {
	    	
	    	accountpage.NavigateAddress();
	    	
	    	System.out.println("Clicks on Account Details from top menu");
	       
	    }

	    @When("^User Click on Add new$")
	    public void user_click_on_add_new() throws Throwable {
	    
	    	
	    	accountpage.addnewaddress();
	    	
	    	System.out.println("Clicks on Account Details from top menu");
	       
	    }

	    @When("^User Clicks on Delete button$")
	    public void user_clicks_on_delete_button() throws Throwable {
	    	
	    	accountpage.DeleteuserAddress();
	    	Alert alert = driver.switchTo().alert();		
    		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	     
	        		
	        // Accepting alert		
	        alert.accept();	
	    	
	    	System.out.println("Clicks on Account Details from top menu");
	       
	    }

	    @Then("^User is navigated to My account section$")
	    public void user_is_navigated_to_my_account_section() throws Throwable {
	    	
	    	accountpage = pagemanage.getaccountpage();
	    	
	    	
	    	String Accpagetitle = driver.findElement(By.xpath("//h1[contains(text(),'My account - Customer info')]")).getText();
	    	System.out.println(Accpagetitle);
	    	
	
	    	
	    	accountpage.ValidateMyaccountPage(Accpagetitle);
	    	
	    	System.out.println("Clicks on Account Details from top menu");
	        
	    }

	    @Then("^User is navigated to My account Addresses section$")
	    public void user_is_navigated_to_my_account_addresses_section() throws Throwable {
	    	
	    	String Addpagetitle = driver.findElement(By.xpath("//h1[contains(text(),'My account - Addresses')]")).getText();
	    	accountpage.ValidateAddressPage(Addpagetitle);
	        
	    }

	    @Then("^User Details are added$")
	    public void user_details_are_added() throws Throwable {
	    	String Addressinfo =  driver.findElement(By.xpath("//strong[contains(text(),'ABCD PQRS')]")).getText();
	    	
	    	accountpage.CheckAddRessAdded(Addressinfo);
	    	
	    	System.out.println("Clicks on Account Details from top menu");
	      
	    }

	    @Then("^User Address is deleted$")
	    public void user_address_is_deleted() throws Throwable {
	    	String Noaddress= driver.findElement(By.xpath("//div[@class='address-list']")).getText();
	    	accountpage.ValidateNoAddressExist(Noaddress);
	    	System.out.println("User Address is deleted");
	       
	    }

	    @And("^Enter User Details$")
	   
	    public void enter_user_details() throws Throwable {
	    	//String customerName = "Lakshay";
	     //Customer customer = fileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
	      
	    	//accountpage.AdduserAddress(customer);
	    	accountpage.AdduserAddress();
	    	System.out.println("Enter User Details");
	       
	    }

	   

	    
	    
	    @After
	    public void closebrowser()
	    
	    {
	    	webDriverManager.closeDriver();
	    	//driver.close();
	    }

}
