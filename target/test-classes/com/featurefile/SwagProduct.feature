Feature: Purchasing Bag in  Swag Application

  
  Scenario: SwagLabs Login Functionality
  	Given User launch the Browser
    And User Launch the url
     When User enter the valid username "username" in the field
     And User enter the valid password "password" in the field
     And User click the Signin button
     Then User should redirected to the dashboard "Products"
	   When User click the Sauce Labs Backpack 
	   When User click the addToCart button
	   And User click the showCart button
	   Then User navigates to CartPage should see a msg as "Your Cart"
	   When User click the checkout button
	   When User enter the FirstName "Ram"
	   And User enter the LastName "Saran"
	   And User enter the ZipCode "600089"
	   And User click the continue button
	   And User click the Finish Button
	   Then User navigates to the Order Page and see the Success message "THANK YOU FOR YOUR ORDER"
	   
     