package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {
	
	private int count= 0;
	private static final int MAX_RETRY=0;

	@Override
	public boolean retry(ITestResult result) {
				
		if(count< MAX_RETRY) {
			
			count++;
			return true;
		}
		else {
			return false;
		}
	}

}
