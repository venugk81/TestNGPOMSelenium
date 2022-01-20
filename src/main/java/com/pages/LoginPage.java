package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

public class LoginPage{
	WebDriver driver;

	@FindBy(xpath="//input[contains(@name, 'name')]")
	WebElement txtName;
	
	@FindBy(xpath="//input[contains(@name, 'login')]")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[contains(@name, 'passw')]")
	WebElement txtPwd;
	
	
	
	public LoginPage(WebDriver _driver) {
		driver= _driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void signupRegistrationForm() {
		txtName.sendKeys("testing");
		txtEmail.sendKeys("testing@gmail.com");
	}
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	
}
