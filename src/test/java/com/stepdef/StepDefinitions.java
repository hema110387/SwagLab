package com.stepdef;

import com.baseclass.SwagBaseClass;
import com.pageobjectmanager.SwagPageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends SwagBaseClass{
	SwagPageObjectManager pom= new SwagPageObjectManager();
	
	@Given("User launch the Browser")
	public void user_launch_the_browser() {
	    launchBrowser(pom.getDataReader().getDataProperty("browser"));
	}
	
	@Given("User Launch the url")
	public void user_launch_the_url() {
		launchUrl(pom.getDataReader().getDataProperty("url"));
	
	}

	@When("User enter the valid username {string} in the field")
	public void user_enter_the_valid_username_in_the_field(String username) {
	   pom.getLoginPageManager().getUserName(username);
	}

	@When("User enter the valid password {string} in the field")
	public void user_enter_the_valid_password_in_the_field(String password) {
	    pom.getLoginPageManager().getPassword(password);
	}

	@When("User click the Signin button")
	public void user_click_the_signin_button() {
	    pom.getLoginPageManager().getSignin();
	}

	@Then("User should redirected to the dashboard {string}")
	public void user_should_redirected_to_the_dashboard(String msg) {
	    pom.getLoginPageManager().getDashBoardMsg(msg);
	}


	
	
}
