package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.ui.utils.BrowserUtility;
import com.ui.utils.LoggerUtil;

public class MyDashboardPage extends BrowserUtility {
	 
	Logger logger = LoggerUtil.getLogger(this.getClass());
	private static final By NAME_FIELD= By.cssSelector(".account span");
	
	public String getName() {
		logger.info("Captuing the test of account name");
		return getText(NAME_FIELD);
	}

}
