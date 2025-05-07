Feature: Purchasing Bag in  Swag Application

  
  Scenario: SwagLabs Login Functionality
  	Given User launch the Browser
    And User Launch the url
     When User enter the valid username "username" in the field
      And User enter the valid password "password" in the field
      And User click the Signin button
     Then User should redirected to the dashboard "Products"
