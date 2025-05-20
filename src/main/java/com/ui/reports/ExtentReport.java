package com.ui.reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	private static ExtentReports extentReports;
	private static ExtentSparkReporter extentSparkReporter;
	
	public static void initReports() {
		if(Objects.isNull(extentReports)) {
			
			extentReports= new ExtentReports();
			extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\index.html");
			extentSparkReporter.config().setDocumentTitle("POM Framework");
			extentSparkReporter.config().setTheme(Theme.STANDARD);
			extentSparkReporter.config().setReportName("Regression Tests");
			extentReports.attachReporter(extentSparkReporter);
			
			
		}
		
	}
	
	public static void closeReports() {
		
		if(Objects.nonNull(extentReports)) {
			extentReports.flush();
		}
		
		ExtentManager.unload();
	}
	
	
	public static void createTest(String testName) {
		ExtentManager.setExtentTest(extentReports.createTest(testName));
	}

}
