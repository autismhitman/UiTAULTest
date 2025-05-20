package com.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {	
	
	
	public static WebDriver getBrowser(String browserName, boolean isHeadless, boolean isLambda, String testName) {
		
		  WebDriver driver =null;
		  
		  if(isLambda) {
			  
			  driver =LambdaTestBrowser.setup(browserName, testName);
			  
		  } else {
		  
			  if(browserName.equalsIgnoreCase("chrome")) {
				  
				 driver = ChromeFactory.getBrowser(browserName, isHeadless);
			  } else if (browserName.equalsIgnoreCase("edge")) {
				  
				 driver = EdgeFactory.getBrowser(browserName, isHeadless);
			  } 
		  
		  } 
	 
		  return driver;
	}

}
