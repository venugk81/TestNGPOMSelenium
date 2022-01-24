package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

public class RediffHomePage{
	WebDriver driver;
	BasePage page;
	
	
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement lnkSignin;
	
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement lnkCreateAccount;
	
	
	@FindBy(xpath="//a[@title='Online Shopping']")
	WebElement lnkOnlineShopping;
	
	
	public RediffHomePage(WebDriver _driver) {
		driver= _driver;
		PageFactory.initElements(driver, this);
		page = new BasePage();		
		page.isElementDisplayed(lnkOnlineShopping, 10);
	}
	
	
	public OnlineShoppingPage navigateToOnlineShoppingPage() {
		page.click(lnkOnlineShopping, "Online Shopping Link");
		return new OnlineShoppingPage(driver);
	}
	
	
	
	
}
