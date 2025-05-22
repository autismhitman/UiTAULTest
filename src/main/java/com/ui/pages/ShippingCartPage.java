package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.utils.BrowserUtility;

public class ShippingCartPage extends BrowserUtility{
	
	private static final By TOS_FIELD= By.id("uniform-cgv");
	
	private static final By CHECKOUT_BTN = By.xpath("//button[@name='processCarrier']");
	
	public PaymentCartPage clickonProcessShippingCartPage() {
		
		click(TOS_FIELD);
		click(CHECKOUT_BTN);
		return new PaymentCartPage();
	}

}
