package com.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeFactory {
	
	public static WebDriver getBrowser(String browserName, boolean isHeadless) {
		
		  WebDriver driver =null;
		  
		  if(browserName.equalsIgnoreCase("edge") && isHeadless) {
			  
			  EdgeOptions options = new EdgeOptions();
			  options.addArguments("--headless");
			  options.addArguments("window-size=1920,1080");
			  driver = new EdgeDriver(options);
		  } 
		  else {
			  
			  driver= new EdgeDriver();
		  }
		   return driver;
	}

}
