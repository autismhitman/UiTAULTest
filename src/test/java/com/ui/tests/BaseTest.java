package com.ui.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ui.drivers.Driver;

public class BaseTest {
	
	
	@Parameters({"browserName", "isHeadless", "isLambda"})
	@BeforeMethod
	public void setUp(@Optional("chrome") String browserName,
			@Optional("false") boolean isHeadless, 
			@Optional("false") boolean isLambda,Method m) {
		
		Driver.initDriver(browserName, isHeadless, isLambda, m.getName());
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		Driver.closeDriver();
		
	}

	
	
}
