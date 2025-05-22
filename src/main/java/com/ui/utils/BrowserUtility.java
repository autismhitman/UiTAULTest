package com.ui.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	public void clearAndEnterText(String text, By locator) {
		WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).clear();
		enterText(text, locator);
	}
	
	public void enterTextByKey(By locator, Keys key) {
		logger.info("Finding the " + locator +" entering the text" + key);
		WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).sendKeys(key);
	}	 
	
	public void click(By locator) {
		logger.info("Clicking on the locator " + locator);
		WaitStrategy.performExplicitWait(WaitLocatorStrategy.CLICKABLE, locator).click();
	}
	
	public void click(WebElement element) {
		logger.info("Clicking on the element " + element);
		element.click();
	}

	public String getText(By locator) {
		logger.info("Returning the captured text of account name"
	     +WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator).getText());
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
    
    public void selectFromDropDown(By locator, String text) {
    	
    	logger.info("Clicking on the locator " + locator);
		WebElement  element= WaitStrategy.performExplicitWait(WaitLocatorStrategy.PRESENCE, locator);
		logger.info("Selecting dropdown " + text); 
		Select select = new Select(element);
		select.selectByVisibleText(text);
    	
    	
    	
    }
    
}
























