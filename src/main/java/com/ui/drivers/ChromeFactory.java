package com.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeFactory {
	
	public static WebDriver getBrowser(String browserName, boolean isHeadless) {
		
		  WebDriver driver =null;
		  
		  if(isHeadless && browserName.equalsIgnoreCase("chrome")) {
			  
			  ChromeOptions options = new ChromeOptions();
			  options.addArguments("--headless");
			  options.addArguments("window-size=1920,1080");
			  driver = new ChromeDriver(options);
		  } 
		  else {
			  
			  driver= new ChromeDriver();
		  }
		   return driver;
	}

}
