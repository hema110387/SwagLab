package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class SwagDataReader {
	private static FileInputStream fileInputStream;
	private static Properties property; // load-- key value

	private static void setupPropertyFile() {

		File file = new File(
"C:\\Users\\ganes\\eclipse-workspace\\TestAutomation\\src\\main\\resources\\SwagData.properties");
		try {
			fileInputStream = new FileInputStream(file);
			property = new Properties();
			property.load(fileInputStream);
		} catch (FileNotFoundException e) {
			Assert.fail("ERROR: FILENOTFOUNDEXCEPTION OCCUR DURING PROPERTY FILE LOADING");

		} catch (IOException e) {
			Assert.fail("ERROR: FILENOTFOUNDEXCEPTION OCCUR DURING PROPERTY FILE LOADING");

		}
	}


	public static String getDataProperty(String datakey) {
		setupPropertyFile();
		String dataValue = property.getProperty(datakey);
		return dataValue;
	}

}


