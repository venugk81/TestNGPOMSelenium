package com.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtil {
	
	public ExtentReports reports;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	public ExtentReports getReportConfig() {
		if(reports==null) {
			reports = new ExtentReports();
			String reportPath = System.getProperty("user.dir") + "/reports/extent-report.html";
			spark = new ExtentSparkReporter(reportPath);
			spark.config().setReportName("This is a Report Name");
			spark.config().setDocumentTitle("Document Title");
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setEncoding("utc-8");		
			reports.attachReporter(spark);	
		}			
		return reports;
	}
	
	public ExtentTest setTestname(String strTestName) {
		test = reports.createTest(strTestName);		
		test.info("Test Name Set: "+ strTestName);
		return test;
	}
	
	public void flushReport() {
		reports.flush();
	}

}
