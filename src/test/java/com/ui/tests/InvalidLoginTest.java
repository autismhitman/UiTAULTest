package com.ui.tests;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.dataProviders.LoginDataProvider;
import com.ui.listeners.MyRetry;
import com.ui.pages.HomePage;
import com.ui.pojos.User;
import com.ui.utils.LoggerUtil;

@Listeners({ com.ui.listeners.MyTestListener.class }) 
public class InvalidLoginTest extends BaseTest {
	

	Logger logger = LoggerUtil.getLogger(this.getClass());
	private static final String INVALID_USERNAME="j@gmail.com";
	private static final String INVALID_PASSWORD="password";
	
	@Test(description="Negative login scenario", groups = {"e2e","sanity"})
			 
	public void validateLoginExcelSuccessful() {		
		 
		assertEquals(new HomePage().clickOnSigninLink().loginWithInvalidCredentials(INVALID_USERNAME,INVALID_PASSWORD)
				.getErrorMessage(),"Authentication failed.");
			
	}
}
