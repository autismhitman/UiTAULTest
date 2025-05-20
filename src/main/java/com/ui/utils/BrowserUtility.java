package com.ui.utils;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.ui.constants.WaitLocatorStrategy;
import com.ui.drivers.DriverManager;

public class BrowserUtility {
	
	Logger logger = LoggerUtil.getLogger(this.getClass());
	 
	public void goToWebsite(String url) {
		logger.info("Visiting the website " + url);
		DriverManager.getDriver().get(url);
	}
	
	public void enterText(String text, By locator) {
		logger.info("Finding the " + locator +" entering the text"+ text);
		WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).sendKeys(text);
	}
	
	public void click(By locator) {
		logger.info("Clicking on the locator " + locator);
		WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).click();
	}

	public String getText(By locator) {
		logger.info("Returning the captured text of account name"+WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).getText() );
		return WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).getText();
	}
	
	
	
	 
 
}
