package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.utils.BrowserUtility;

public class ShoppingCartPage extends BrowserUtility{
	
	private static final By checkOutBTN= By.cssSelector("a.button.button.btn.btn-default.standard-checkout.button-medium");
	
	
	public AddressCartPage clickOnCheckoutShoppingCartPage() {
		
		click(checkOutBTN);
		return new AddressCartPage();
	}

}
