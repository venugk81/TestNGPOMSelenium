package com.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshotUtil {
	

	
	
	public static void captureScreen(WebDriver driver) {
		try {
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String curDir = System.getProperty("user.dir") + File.separator+ "screens\\ExceptionScreen_"+ System.currentTimeMillis() + ".png";
			System.out.println("Screen shot path: "+ curDir);
			FileUtils.copyFile(srcFile, new File(curDir));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
