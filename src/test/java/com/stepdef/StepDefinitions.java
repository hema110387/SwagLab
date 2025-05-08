package com.stepdef;

import com.baseclass.SwagBaseClass;
import com.pageobjectmanager.SwagPageObjectManager;
import com.utility.SwagDataReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends SwagBaseClass{
	SwagPageObjectManager pom= new SwagPageObjectManager();
	
	@Given("User launch the Browser")
	public void user_launch_the_browser() {
	    pom.getDataReader();
		launchBrowser(SwagDataReader.getDataProperty("browser"));
	}
	
	@Given("User Launch the url")
	public void user_launch_the_url() {
		pom.getDataReader();
		launchUrl(SwagDataReader.getDataProperty("url"));
	
	}

	@When("User enter the valid username {string} in the field")
	public void user_enter_the_valid_username_in_the_field(String username) {
	   pom.getLoginPageManager().getUserName("Hema");
	}

	@When("User enter the valid password {string} in the field")
	public void user_enter_the_valid_password_in_the_field(String password) {
	    pom.getLoginPageManager().getPassword("test");
	}

	@When("User click the Signin button")
	public void user_click_the_signin_button() {
	    pom.getLoginPageManager().getSignin();
	}

	@Then("User should redirected to the dashboard {string}")
	public void user_should_redirected_to_the_dashboard(String msg) {
	    pom.getLoginPageManager().getDashBoardMsg(msg);
	}
	
	@When("User click the Sauce Labs Backpack")
	public void user_click_the_sauce_labs_backpack() {
	    pom.getInventoryReader().getSauceBag();
	}


	@When("User click the addToCart button")
	public void user_click_the_add_to_cart_button() {
	    pom.getInventoryReader().getaddToCart();
	    
	}

	@When("User click the showCart button")
	public void user_click_the_show_cart_button() {
	   pom.getInventoryReader().getshopCart();
	    
	}

	@Then("User navigates to CartPage should see a msg as {string}")
	public void user_navigates_to_cart_page_should_see_a_msg_as(String string) {
	   pom.getInventoryReader().getSuccessCartMsg();
	    
	}

	@When("User click the checkout button")
	public void user_click_the_checkout_button() {
	   pom.getSwagCartPage().getCheckOut();
	    
	}

	@When("User enter the FirstName {string}")
	public void user_enter_the_first_name(String firstname) {
	   
	    pom.getSwagCheckOutPage().getFirstName("latha");
	}

	@When("User enter the LastName {string}")
	public void user_enter_the_last_name(String lastname) {
	   
	    pom.getSwagCheckOutPage().getLastName("test");
	}

	@When("User enter the ZipCode {string}")
	public void user_enter_the_zip_code(String postalcode) {
	   pom.getSwagCheckOutPage().getpostalCode("6789098");
	    
	}

	@When("User click the continue button")
	public void user_click_the_continue_button() {
	   pom.getSwagCheckOutPage().getContinueBtn();
	    
	}

	@When("User click the Finish Button")
	public void user_click_the_finish_button() {
	   pom.getSwagCheckOutPage().getFinishBtn();
	    
	}

	@Then("User navigates to the Order Page and see the Success message {string}")
	public void user_navigates_to_the_order_page_and_see_the_success_message(String ordermsg) {
	   
	    pom.getSwagCheckOutPage().getSuccessOrderMsg(ordermsg);
	}


}
