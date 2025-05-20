package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.ui.utils.BrowserUtility;
import com.ui.utils.LoggerUtil;

public class MyAccountPage extends BrowserUtility {
	
	 
	
	private static final By EMAIL_FIELD= By.id("email");
	private static final By PASSWORD_FIELD= By.id("passwd");
	private static final By SIGN_IN_BUTTON= By.id("SubmitLogin");
	Logger logger = LoggerUtil.getLogger(this.getClass());
	
	public MyDashboardPage login(String username, String password) {
		logger.info("Entering the username "+ username);
		enterText(username, EMAIL_FIELD);
		logger.info("Entering the pasword "+ password);
		enterText(password, PASSWORD_FIELD);
		logger.info("clicking on the signin button");
		click(SIGN_IN_BUTTON);
		return new MyDashboardPage();
		
	}

}
