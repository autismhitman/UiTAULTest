package com.ui.pages;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.ui.utils.BrowserUtility;
import com.ui.utils.LoggerUtil;

public class MyDashboardPage extends BrowserUtility {
	 
	Logger logger = LoggerUtil.getLogger(this.getClass());
	private static final By NAME_FIELD= By.cssSelector(".account span");
	
	private static final By SEARCH_TEXT_FIELD = By.id("search_query_top");
	private static final By SEARCH_BTN= By.xpath("//button[@name='submit_search' and @type='submit']");
	private static final By ADD_ADDRESS = By.xpath("//a[@title='Add my first address']")	;	
 
	
	
	public String getName() {
		logger.info("Capturing the test of account name");
		return getText(NAME_FIELD);
	}
	
	public SearchResultPage searchProductName(String productName) {
		enterText(productName,SEARCH_TEXT_FIELD);
		enterTextByKey( SEARCH_TEXT_FIELD, Keys.ENTER);
		return new SearchResultPage();
	}
	
	 public AddressPage addNewAddress() {
		   
		   click(ADD_ADDRESS);
		   return new AddressPage();
	   }

}
