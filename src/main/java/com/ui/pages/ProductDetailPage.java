package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.constants.SIZE;
import com.ui.pages.ShoppingCartPage;
import com.ui.utils.BrowserUtility;

public class ProductDetailPage extends BrowserUtility {
	
	
	private static final By SIZE_FIELD= By.id("group_1");
	private static final By CART_BTN= By.xpath("//button[@name='Submit']");
	private static final By SECONDCHECKOUTBTN= By.cssSelector("a.btn.btn-default.button.button-medium");
	
	public ProductDetailPage changeSize(SIZE size) {
		
		selectFromDropDown(SIZE_FIELD,SIZE.L.toString());
		return this;
	}
	
	public ShoppingCartPage clickOnCartBtnProductDetailPage() {
		
		click(CART_BTN);
		click(SECONDCHECKOUTBTN);
		return new ShoppingCartPage();
	}

}
