package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SwagBaseClass;
import com.interfaceelements.SwagLogin_interfaceElements;
import com.utility.SwagDataReader;

public class SwagLoginPage extends SwagBaseClass implements SwagLogin_interfaceElements{
	SwagDataReader data=new SwagDataReader();
	
	@FindBy(id=username_id )
	private WebElement username;
	
	@FindBy(name=password_name)
	private WebElement password;
	
	@FindBy(xpath=sigin_xpath)
	private WebElement signin;
	
	@FindBy(xpath=dashboard_xpath)
	private WebElement dashboard_msg;
	
	
	public SwagLoginPage() {
		PageFactory.initElements(driver, this);
			
	}
	
	public void getUserName(String swagusername) {
		inputValues(username, swagusername);
	}
	
	public void getPassword(String swagpassword) {
		inputValues(password, swagpassword);
	}
	
	public void getSignin() {
		clickElement(signin);
	}
	
	public void getDashBoardMsg(String dashboardmessage) {
		assertText(dashboard_msg, dashboardmessage);
	}
	
	
	
}
