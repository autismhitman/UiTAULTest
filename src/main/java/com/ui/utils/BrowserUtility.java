package com.ui.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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
	
	public void enterTextByKey(By locator, Keys key) {
		logger.info("Finding the " + locator +" entering the text" + key);
		WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).sendKeys(key);
	}	 
	
	public void click(By locator) {
		logger.info("Clicking on the locator " + locator);
		WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).click();
	}

	public String getText(By locator) {
		logger.info("Returning the captured text of account name"+WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).getText() );
		return WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).getText();
	}	
	
	public static String getXpath(String xpath, String value) {
		return String.format(xpath, value);//a[text()='%s'] 
	}
	
	public List<WebElement> getProductList(By Locator){
		
		return DriverManager.getDriver().findElements(Locator);
	}
	
    public List<String> getNameOfProductList(By Locator){
		
	  return getProductList(Locator).stream().map(x->x.getText()).collect(Collectors.toList());
    }
}
