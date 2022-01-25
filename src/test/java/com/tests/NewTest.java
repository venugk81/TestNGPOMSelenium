package com.tests;

import java.util.LinkedHashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.ExcelReader;

public class NewTest {
	
	String sheetname="RegisterUser";
	Object data[][];
	
	
	//Here if you dont pass the name, then you can directly give the name for the test method name..  @Test(dataProvider = "getTestData")
	@DataProvider(name = "RegisterData")			
	public Object[][] getTestData() {
		data = ExcelReader.readData(sheetname);
		return data;
	}
	
	
  @Test(dataProvider = "RegisterData")
  public void f(LinkedHashMap<String, String> dataSet) {
	  System.out.println(dataSet.get("TestName"));
	  System.out.println(dataSet.get("firstname"));
	  System.out.println(dataSet.get("lastname"));
	  System.out.println("===========================");
  }
}
