package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

public class RegisterUserPage{
	WebDriver driver;
	BasePage page;
	RediffHomePage rediffHomePage;
	
	@FindBy(xpath="//input[contains(@name, 'name')]")
	WebElement txtName;
	
	@FindBy(xpath="//input[contains(@name, 'login')]")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[contains(@name, 'passw')]")
	WebElement txtPwd;
	
	@FindBy(xpath="//input[contains(@name, 'confirm_passwd')]")
	WebElement txtPwd2;
	
	
	@FindBy(xpath="//input[contains(@name, 'chk_altemail')]")
	WebElement chkNoAlternateEmail;
	
	@FindBy(id="mobno")
	WebElement txtMobileNo;
	
	@FindBy(xpath="//select[contains(@name, 'DOB_Day')]")
	WebElement lstDayDOB;
	
	@FindBy(xpath="//select[contains(@name, 'country')]")
	WebElement lstCountry;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement lnkHome;
	
	public RegisterUserPage(WebDriver _driver) {
		driver = _driver;
		PageFactory.initElements(driver, this);
		page = new BasePage();
		
	}
	
	public void signupRegistrationForm() {
//		txtName.sendKeys("testing");
		page.sendText(txtName, "testing");
		txtEmail.sendKeys("testing@gmail.com");
		chkNoAlternateEmail.click();			
//		Select select = new Select(lstDayDOB);		
//		select.selectByVisibleText("09");		
		page.selectByVisibleText(lstDayDOB, "09");		
		page.selectByVisibleText(lstCountry, "Madagascar");
	}
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public RediffHomePage navigateToRediffHome() {
		page.click(lnkHome, "Home");
		return new RediffHomePage(driver);
	}
	
	
	
	
}
