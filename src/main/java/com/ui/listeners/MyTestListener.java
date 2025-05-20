package com.ui.listeners;

import java.util.Arrays;

import org.apache.logging.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ui.reports.ExtentReport;
import com.ui.utils.LoggerUtil;

public class MyTestListener implements ITestListener, ISuiteListener {
	
	Logger logger = LoggerUtil.getLogger(this.getClass());

	@Override
	public void onTestStart(ITestResult result) {
		 logger.info(result.getMethod().getMethodName());
		 logger.info(result.getMethod().getDescription());
		 logger.info(Arrays.toString(result.getMethod().getGroups()));
		 ExtentReport.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 logger.info(result.getMethod().getMethodName() +" is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.error(result.getMethod().getMethodName() +" is Fail");
		logger.error(result.getThrowable().getMessage());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.warn(result.getMethod().getMethodName() +" is Skipped");
		 
	}

	@Override
	public void onStart(ISuite suite) {
		
		logger.info("Test Suite Started");
		ExtentReport.initReports();
	}

	@Override
	public void onFinish(ISuite suite) {
		logger.info("Test suite completed");
		ExtentReport.closeReports();
	}
	
}
