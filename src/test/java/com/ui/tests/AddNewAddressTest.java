package com.ui.tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.ui.pages.HomePage;
import com.ui.pages.MyDashboardPage;
import com.ui.pojos.Address;
import com.ui.utils.FakerUtility;

@Listeners({ com.ui.listeners.MyTestListener.class }) 
public class AddNewAddressTest extends BaseTest {
	 
	private MyDashboardPage dp;
	private Address address;
	
	@BeforeMethod
	public void setup() {
		
		dp= new HomePage().clickOnSigninLink().login("rejiva4640@magpit.com","password");
		address= FakerUtility.getAddressData();
	}
	
	@Test(description="User is able to add a new address",
			groups= {"e2e","smoke"})
	public void verifyNewAddressTest() {
		
		 String data = dp.addNewAddress().enterAddressAndSave(address);
		 assertEquals(data,"MY_ADD");
	     Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(20));
	}
	
	
	
	 
}
