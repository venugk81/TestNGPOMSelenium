package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.Constants;

public class BasePage {
	
	public WebDriver driver;
	public String chromePath = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
	public Properties prop;
	
	public BasePage() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/properties/application.properties");			
			prop.load(fis);		
			System.out.println(prop.getProperty("url"));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception oExp) {
			oExp.printStackTrace();
		}
	}
	
	public void initialization() {
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Constants.MIN, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		System.out.println("Driver is launched and navigated to URL.");
	}
	
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	
	/*
	 * public static void main(String[] args) { BasePage b = new BasePage();
	 * System.out.println(prop.getProperty("url")); }
	 */

}
