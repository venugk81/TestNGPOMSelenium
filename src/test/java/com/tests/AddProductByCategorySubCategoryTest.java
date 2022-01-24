package com.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.pages.OnlineShoppingPage;
import com.pages.RediffHomePage;
import com.pages.RegisterUserPage;

public class AddProductByCategorySubCategoryTest extends BasePage{

	RegisterUserPage registerPage;
	RediffHomePage homePage;
	OnlineShoppingPage shoppingPage;
	
	public AddProductByCategorySubCategoryTest() {		
		super();		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		registerPage = new RegisterUserPage(driver);
				
	}
	
	@Test
	public void test() {
		System.out.println("I am in Login Test java");
		homePage = registerPage.navigateToRediffHome();
		shoppingPage = homePage.navigateToOnlineShoppingPage();
		shoppingPage.SelectProductByCategory("Bags and Luggage", "Travel Bags");
		shoppingPage.addProductToCart();
	}
	
	@AfterTest
	public void afterTest() {
		closeDriver();
	}
}
