package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.ui.constants.Env;
import com.ui.utils.BrowserUtility;
import com.ui.utils.PropertyUtil;
import com.ui.utils.JsonUtil;
import com.ui.utils.LoggerUtil;

public class HomePage extends BrowserUtility{
		
	Logger logger = LoggerUtil.getLogger(this.getClass());
	private static final By SIGN_IN_LINK = By.cssSelector("a.login");
	
	 	
	public MyAccountPage clickOnSigninLink() {
		//goToWebsite(PropertyUtil.readValue(Env.QA, "url"));
		   logger.info("Navigating to the website");
		  goToWebsite(JsonUtil.fetchValue());
		 click(SIGN_IN_LINK);
		 return new MyAccountPage();
	}

}
