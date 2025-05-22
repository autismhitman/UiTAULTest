package com.ui.tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.ui.constants.SIZE;
import com.ui.pages.HomePage;
import com.ui.pages.MyDashboardPage;
import com.ui.pages.SearchResultPage;

@Listeners({ com.ui.listeners.MyTestListener.class })
public class ProductCheckoutTest extends BaseTest{
	
	
    private static final String SEARCH_TERM = "Printed Summer Dress";
	private SearchResultPage searchResultPage;
	
	@BeforeMethod
	public void setup() {
		
		searchResultPage= new HomePage().clickOnSigninLink().login("rejiva4640@magpit.com","password").searchProductName(SEARCH_TERM);
		  
	}
	
	@Test(description="User is able to buy a product",
			groups= {"e2e","smoke"})
	public void checkoutTest() {
		
		String text =searchResultPage.selectProductAt(0).changeSize(SIZE.L)
				.clickOnCartBtnProductDetailPage()
		        .clickOnCheckoutShoppingCartPage()
		        .clickCheckoutAddressCartPage()
		        .clickonProcessShippingCartPage()
		        .clickonModePaymentPaymentCartPage()
		        .getSuccessMessage();
		System.out.println(text);
		assertEquals( text ,"Your order on My Shop is complete.");
	    Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));
	}
	
	
	

}
