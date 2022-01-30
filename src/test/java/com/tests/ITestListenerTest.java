package com.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.utils.ITestListenerUtil;

//@Listeners(ITestListenerUtil.class)		//if u dont have listener tag in testng xml
public class ITestListenerTest {
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in before Suite");
	}
	
	@Test
	public void test() {
		System.out.println("test method started execution.");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am in after suite");
	}

}
