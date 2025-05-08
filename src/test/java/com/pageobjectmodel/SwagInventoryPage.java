package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.SwagBaseClass;
import com.interfaceelements.SwagInventoryPageInterfaceElements;

public class SwagInventoryPage extends SwagBaseClass implements SwagInventoryPageInterfaceElements{

	@FindBy(xpath=saucebag_xpath)
	private WebElement sauceBag;
	
	@FindBy(xpath=addToCart_xpath)
	private WebElement addToCart;
	
	@FindBy(xpath=shopCart_xpath)
	private WebElement shopCart;
	
	@FindBy(xpath=SuccessCartMsg_xpath)
	private WebElement SuccessCartMsg;
	
	
	public SwagInventoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getSauceBag() {
		clickElement(sauceBag);
	}
	
	public void getaddToCart() {
		clickElement(addToCart);
	}
	
	public void getshopCart() {
		clickElement(shopCart);
	}
	
	public void getSuccessCartMsg() {
		clickElement(SuccessCartMsg);
	}
	
	
	
	
}
