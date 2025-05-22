package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.utils.BrowserUtility;

public class PaymentCartPage extends BrowserUtility{

	
	private static final By MODE_OF_PAYMENT =By.cssSelector("p.payment_module a.bankwire");
	private static final By CONFIRMORDER= By.cssSelector("button.button.btn.btn-default.button-medium");
	
	public OrderConfirmationPage clickonModePaymentPaymentCartPage() {
		
		click(MODE_OF_PAYMENT);
		click(CONFIRMORDER);
		return new OrderConfirmationPage();
	}
}
