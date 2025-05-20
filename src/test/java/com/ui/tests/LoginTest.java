package com.ui.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ui.dataProviders.LoginDataProvider;
import com.ui.listeners.MyRetry;
import com.ui.pages.HomePage;
import com.ui.pojos.User;

 
public class LoginTest extends BaseTest {
	
	
	@Test(description="Positive login scenario", groups = {"e2e","sanity"}, 
			dataProviderClass=LoginDataProvider.class, dataProvider="loginTestData")
	public void validateLoginJsonSuccessful(User user) {		
		 
		assertEquals(new HomePage().clickOnSigninLink().login(user.getEmail(),user.getPassword()).getName(),"Navin Sharma");
			
	}
	
	
	@Test(description="Positive login scenario", groups = {"e2e","sanity"}, 
			dataProviderClass=LoginDataProvider.class, dataProvider="loginTestCSVData")
	public void validateLoginCsvSuccessful(User user) {		
		 
		assertEquals(new HomePage().clickOnSigninLink().login(user.getEmail(),user.getPassword()).getName(),"Navin Sharma");
			
	}
	
	@Test(description="Positive login scenario", groups = {"e2e","sanity"}, 
			dataProviderClass=LoginDataProvider.class, dataProvider="loginTestExcelData",retryAnalyzer=MyRetry.class)
	public void validateLoginExcelSuccessful(User user) {		
		 
		assertEquals(new HomePage().clickOnSigninLink().login(user.getEmail(),user.getPassword()).getName(),"Navin Sharma");
			
	}
}
