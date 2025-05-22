package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.utils.BrowserUtility;

public class ShippingCartPage extends BrowserUtility{
	
	private static final By tos_field= By.id("uniform-cgv");
	
	private static final By checkout_BTN = By.xpath("//button[@name='processCarrier']");
	
	public PaymentCartPage clickonProcessShippingCartPage() {
		
		click(tos_field);
		click(checkout_BTN);
		return new PaymentCartPage();
	}

}
