package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.utils.BrowserUtility;

public class AddressCartPage extends BrowserUtility {
	
	private static final By checkout_BTN= By.xpath("//button[@name='processAddress']");
	
	public ShippingCartPage clickCheckoutAddressCartPage() {
		
		click(checkout_BTN);
		return new ShippingCartPage();
	}

}
