package com.ui.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pages.MyDashboardPage;

@Listeners({ com.ui.listeners.MyTestListener.class }) 
public class SearchProductTest extends BaseTest {
	 
	private MyDashboardPage dp;
	
	@BeforeMethod
	public void setup() {
		
		dp= new HomePage().clickOnSigninLink().login("rejiva4640@magpit.com","password");
	}
	
	@Test(description="Verify logged in user is able to search product and correct search result is displayed",
			groups= {"e2e","smoke"})
	public void verifyProductSearchTest() {
		
		String data= dp.searchProductName("Printed Summer Dress").getSearchProductListing();
		System.out.println(data);
		assertEquals(data,"\"PRINTED SUMMER DRESS\"");
	}
	
	

	
	@Test(description="Verify logged in user is able to search product and correct search result is displayed",
			groups= {"e2e","smoke"})
	public void verifyProductSearchCountTest() {
		
		assertEquals(dp.searchProductName("Printed Summer Dress").isSearchTermPresentinProductList("Printed Summer Dress"),true);
		
	}

}
