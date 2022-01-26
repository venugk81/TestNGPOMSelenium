package com.tests;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.pages.LoginPage;

public class LoginTest extends BasePage{

	LoginPage loginPage;
	
	
	public LoginTest() {		
		super();		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage(driver);
		System.out.println("File separator: "+ File.separator);		
	}
	
	@Test
	public void test() throws Exception {
		System.out.println("I am in Login Test java");
		loginPage.signupRegistrationForm();
		
	}
	
	@AfterTest
	public void afterTest() {
		closeDriver();
	}
}
