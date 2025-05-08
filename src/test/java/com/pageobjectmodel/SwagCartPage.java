package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SwagBaseClass;
import com.interfaceelements.SwagCartInterfaceElements;

public class SwagCartPage extends SwagBaseClass implements SwagCartInterfaceElements{
		@FindBy(xpath=checkOut_xpath)
		private WebElement checkOutBtn;
	
		@FindBy(xpath=Success_CheckOutMsg_xpath)
		private WebElement checkOutMsg;
		
		public SwagCartPage() {
			PageFactory.initElements(driver, this);
		}
		
		public void getCheckOut() {
			clickElement(checkOutBtn);
		}
		public void getCheckOutMsg(String checkoutmsg) {
			assertText(checkOutMsg, checkoutmsg);
		}
		
}
