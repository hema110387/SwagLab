package com.pageobjectmanager;

import com.pageobjectmodel.SwagLoginPage;
import com.utility.SwagDataReader;

public class SwagPageObjectManager {

	private SwagLoginPage login;
	private SwagDataReader reader;
	
	
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
}
