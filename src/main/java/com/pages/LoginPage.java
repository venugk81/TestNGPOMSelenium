package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BasePage;
import com.utils.CaptureScreenshotUtil;

public class LoginPage{
	WebDriver driver;
	BasePage page;
	@FindBy(xpath="//input[contains(@name, 'name')]")
	WebElement txtName;
	
	@FindBy(xpath="//input[contains(@name, 'login')]")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[contains(@name, 'passw1')]")
	WebElement txtPwd;
	
	
	
	public LoginPage(WebDriver _driver) {
		driver= _driver;
		PageFactory.initElements(driver, this);
		page = new BasePage();
//		CaptureScreenshotUtil.captureScreen(driver);
		
	}
	
	public void signupRegistrationForm() throws Exception {
//		txtName.sendKeys("testing");
		page.sendText(txtName, "testing");
		txtEmail.sendKeys("testing@gmail.com");
		txtPwd.sendKeys("passwordcom");
	}
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	
	
}
