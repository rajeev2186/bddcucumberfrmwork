Feature: Validate Login to nopCommerce

  Scenario: Validate Adding Book to Cart is displayed in shopping cart
    Given User is Dashboard Page
    When User Clicks Books Menu
    Then User is Navigated to Books Main page
    When User Add Computing and Internet Book to Cart
    And Clicks on Shopping Cart option from Top Menu
    Then Computing and Internet is displayed in the shopping cart
    When User clicks on Remove Checkbox
    And Clicks on Update Shopping cart
    Then Shopping cart is empty

  Scenario: Validate Adding Book to Cart is displayed in shopping cart
    Given User is Dashboard Page
    When User Clicks Books Menu
    Then User is Navigated to Books Main page
    When User Add Computing and Internet Book to Cart
    And Clicks on Shopping Cart option from Top Menu
    Then Computing and Internet is displayed in the shopping cart
    When User clicks on Remove Checkbox
    And Clicks on Update Shopping cart
    Then Shopping cart is empty