package com.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.pages.RegisterUserPage;

public class RegisterUserTest extends BasePage{

	RegisterUserPage loginPage;
	
	
	public RegisterUserTest() {		
		super();		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new RegisterUserPage(driver);
				
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
