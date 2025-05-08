package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SwagBaseClass;
import com.interfaceelements.SwagCheckOutInterfaceElements;

public class SwagCheckOutPage extends SwagBaseClass implements SwagCheckOutInterfaceElements{
	@FindBy(xpath=firstName_css)
	private WebElement firstName;
	
	@FindBy(id=lastName_id)
	private WebElement lastName;
	
	@FindBy(xpath=postalCode_xpath)
	private WebElement postalCode;
	
	@FindBy(xpath=contiueBtn_xpath)
	private WebElement continueBtn;
	
	@FindBy(xpath=finish_xpath)
	private WebElement finishBtn;
	
	@FindBy(xpath=SuccessOrderMsg_xpath)
	private WebElement SuccessOrdermsg;
	
	public SwagCheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getFirstName(String firstname) {
		inputValues(firstName, firstname);
	}
	public void getLastName(String lastname) {
		inputValues(lastName, lastname);
	}
	
	public void getpostalCode(String postalcode) {
		inputValues(postalCode, postalcode);
	}

	public void getContinueBtn() {
		clickElement(continueBtn);
	}

	public void getFinishBtn() {
		clickElement(finishBtn);
	}
	
	public void getSuccessOrderMsg(String Msg) {
		assertText(SuccessOrdermsg, Msg);
	}
}
