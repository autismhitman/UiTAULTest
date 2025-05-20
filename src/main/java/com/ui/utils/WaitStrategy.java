package com.ui.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ui.constants.WaitLocatorStrategy;
import com.ui.drivers.DriverManager;

public class WaitStrategy {
	
	public static WebElement performExplicitWait(WaitLocatorStrategy waitstrategy, By by) {
		
		WebElement element = null;
		
		if(waitstrategy==WaitLocatorStrategy.CLICKABLE) {
			
			element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
					.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitstrategy==WaitLocatorStrategy.PRESENCE) {
			
			element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
					.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitstrategy==WaitLocatorStrategy.VISIBLE) {
			
			element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitstrategy==WaitLocatorStrategy.NONE) {
			
			element = DriverManager.getDriver().findElement(by) ;
		}
		
		return element;
		
	}
	

}
