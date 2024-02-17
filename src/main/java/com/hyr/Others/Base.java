package com.hyr.Others;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public static WebDriver driver;
	
	public static void initialiseBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");  
	}
	
public static void FailedScreenshot(String testMethodName) throws IOException {
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date d = new Date();
	String timeStamp = d.toString().replace(":", "_").replace(" ", "_");
	FileUtils.copyFile(srcFile, new File("./Screenshots/"+ testMethodName + "_" + timeStamp + ".png"));
}
}
