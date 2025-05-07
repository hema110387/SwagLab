package com.swagrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "C:\\Users\\ganes\\eclipse-workspace\\TestAutomation\\src\\test\\resources\\com\\featurefile\\SwagLogin.feature",
		glue="com.stepdef",
		monochrome = false,
		dryRun = true,
		publish=false,
		plugin= {
				"html:LumaReports/LumarHTMLReports.html",
				"json:LumaReports/LumaJSONReports.json",
			"pretty",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				//"timeline:targetTimeline/cucumber"
				 //"com.aventstack.chaintest.plugins.ChainTestCucumberListener:" 		
		}
		
		)

public class SwagTestRunner {
  
	
	
	
}
