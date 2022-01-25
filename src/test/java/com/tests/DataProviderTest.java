package com.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	@DataProvider(name="data1")
	public Object[][] getData() {
		return new Object[][] {{"Lambda Test"},{"Automation"}};		
	}

	@Test(dataProvider = "data1")
	public void test1Method(String val) {
		System.out.println("test1Method Value: "+ val);
	}
	
	@DataProvider
	public Object[][] getData1() {
		return new Object[][] {{"Venu 1"},{"Gopi 1"}};		
	}

	@Test(dataProvider = "getData1")
	public void test2Method(String val) {
		System.out.println("test2Method Value: "+ val);
	}
	
}
