package com.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.pages.LoginPage;

public class LoginTest2 extends BasePage{

	LoginPage loginPage;
	
	
	public LoginTest2() {		
		super();		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage(driver);
				
	}
	
	@Test
	public void test() {
		System.out.println("I am in Login Test java");
		loginPage.signupRegistrationForm();
	}
	
	@AfterTest
	public void afterTest() {
		closeDriver();
	}
}
