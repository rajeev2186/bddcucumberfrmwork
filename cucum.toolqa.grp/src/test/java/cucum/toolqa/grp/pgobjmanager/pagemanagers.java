package cucum.toolqa.grp.pgobjmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucum.toolqa.grp.pgfactory.account_pagefactory;
import cucum.toolqa.grp.pgfactory.books_pagefactory;
import cucum.toolqa.grp.pgfactory.home_pagefactory;
import cucum.toolqa.grp.pgfactory.login_pagefactory;
import cucum.toolqa.grp.pgfactory.shoppingcart_pagefactory;

public class pagemanagers {
	
	
	 private WebDriver driver;
	 
	 private login_pagefactory loginpage;
	 
	 private home_pagefactory homePage;
	 
	 private books_pagefactory bookPage;
	 
	 private shoppingcart_pagefactory shoppingcartPage;
	 
	 private account_pagefactory accountPage;
	 
	
    public pagemanagers(WebDriver driver)
    {
    	this.driver = driver;
    }
	
    public login_pagefactory getloginpage() {
		return (loginpage == null) ? loginpage = new login_pagefactory(driver) :loginpage ;
    	
    }
    
    public home_pagefactory gethomeage() {
  		return (homePage == null) ? homePage = new home_pagefactory(driver) :homePage ;
      	
      }
    
    public books_pagefactory getbookpage() {
  		return (bookPage == null) ? bookPage = new books_pagefactory(driver) :bookPage ;
      	
      }
    
    public shoppingcart_pagefactory getshoppingcartpage() {
  		return (shoppingcartPage == null) ? shoppingcartPage = new shoppingcart_pagefactory(driver) :shoppingcartPage ;
      	
      }
    
    public account_pagefactory getaccountpage() {
  		return (accountPage == null) ? accountPage = new account_pagefactory(driver) :accountPage ;
      	
      }

}
