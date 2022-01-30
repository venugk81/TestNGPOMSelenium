package com.utils;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class IReportListenerUtil implements IReporter{

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		for(ISuite suite: suites) {
			String suitename= suite.getName();
			
			Map<String, ISuiteResult> suiteResults = suite.getResults();
			for(ISuiteResult sr: suiteResults.values()) {
				ITestContext tc= sr.getTestContext();
				System.out.println("Passed tests for the suite: "+ suitename + "total passed tests: "+ tc.getPassedTests().getAllResults().size());
				System.out.println("Passed tests for the suite: "+ suitename + "total passed tests: "+ tc.getFailedTests().getAllResults().size());
				System.out.println("Passed tests for the suite: "+ suitename + "total passed tests: "+ tc.getSkippedTests().getAllResults().size());
			}
			
		}
		
	}

	
}
