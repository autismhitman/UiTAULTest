package com.ui.drivers;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	
	public static void initDriver( String browserName, boolean isHeadless, boolean isLambda, String testName) {
		
		if(Objects.isNull(DriverManager.getDriver())) {
			
			WebDriver driver = DriverFactory.getBrowser(browserName, isHeadless, isLambda, testName);
			DriverManager.setDriver(driver);
			
						
		}
	}

	public static void closeDriver() {
		 
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
