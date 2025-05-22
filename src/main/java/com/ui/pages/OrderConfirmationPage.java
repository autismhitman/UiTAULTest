package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.utils.BrowserUtility;

public class OrderConfirmationPage extends BrowserUtility {
	
	private static final By SUCCESSMESSAGE = By.cssSelector("p.alert.alert-success");
	
	public String getSuccessMessage() {
		
		return getText(SUCCESSMESSAGE);
	}
	

}
