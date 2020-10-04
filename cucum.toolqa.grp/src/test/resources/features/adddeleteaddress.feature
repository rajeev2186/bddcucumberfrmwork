Feature: User can add and delete address

  Scenario: Validate User Can add and Delete Address
    When Clicks on Account Details from top menu
    Then User is navigated to My account section
    When User Clicks on Adddress link
    Then User is navigated to My account Addresses section
    When User Click on Add new
    And Enter User Details
    Then User Details are added
    When User Clicks on Delete button
    Then User Address is deleted