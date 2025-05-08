package com.pageobjectmanager;

import com.pageobjectmodel.SwagCartPage;
import com.pageobjectmodel.SwagCheckOutPage;
import com.pageobjectmodel.SwagInventoryPage;
import com.pageobjectmodel.SwagLoginPage;
import com.utility.SwagDataReader;

public class SwagPageObjectManager {

	private SwagLoginPage login;
	private SwagDataReader reader;
	private SwagInventoryPage inventory;
	private SwagCartPage cart;
	private SwagCheckOutPage checkout;
	
	public SwagLoginPage getLoginPageManager() {
		
		if(login== null) {
			login=new SwagLoginPage();
		}
		return login;
	}
	
	public SwagDataReader getDataReader() {
		if(reader== null) {
			reader=new SwagDataReader();
		}
		return reader;
	}
	
	public SwagInventoryPage getInventoryReader() {
		if(inventory== null) {
			inventory=new SwagInventoryPage();
		}
		return inventory;
	}
	
	public SwagCartPage getSwagCartPage() {
		if(cart==null) {
			cart =new SwagCartPage();
			}
		return cart;
	}
	
	public SwagCheckOutPage getSwagCheckOutPage() {
		if(checkout==null) {
			checkout =new SwagCheckOutPage();
			
		}
		return checkout;
	}
	
}
