package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BasePage;
import com.utils.Constants;

public class CRMLoginPage extends BasePage{
	
	@FindBy(name="email")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//div[.='Login']")
	WebElement btnLogin;
	
	
	public CRMLoginPage() {
		PageFactory.initElements(driver, this);		
	}
	
	public void login() {
		try {
			
				sendText(txtUsername, prop.getProperty("username"));
				sendText(txtPassword, prop.getProperty("password"));
				click(btnLogin);
		
		}catch(Exception oExp) {
			Assert.fail("Failed to login user to CRM. "+ oExp.getMessage());
		}
	}
	
	

}
