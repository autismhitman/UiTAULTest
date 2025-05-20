package com.ui.drivers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LambdaTestBrowser {
	
	
	 public static final String HUB_URL = "https://hub.lambdatest.com/wd/hub";
	    

	    public static WebDriver setup(String browserName, String testName) {

	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("browserName", browserName);
	        capabilities.setCapability("browserVersion", "127");
	        Map<String, Object> ltOptions = new HashMap<>();
	        ltOptions.put("user", "restpostman1");
	        ltOptions.put("accessKey", "LT_KrjPPM732aEwK24eVMvVsvp2tmFO5RHnDwMz2vs3NI22Jzb");
	        ltOptions.put("build", "Selenium 4");
	        ltOptions.put("name", testName);
	        ltOptions.put("platformName", "Windows 10");
	        ltOptions.put("seCdp", true);
	        ltOptions.put("selenium_version", "4.23.0");
	        capabilities.setCapability("LT:Options", ltOptions);

	        WebDriver driver= null;
			try {
				driver = new RemoteWebDriver(new URL(HUB_URL), capabilities);
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}
	        return driver;
	    }

}
