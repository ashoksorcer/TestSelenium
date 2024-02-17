package com.hyr.Others;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		//List<WebElement> ele = driver.findElements(By.xpath("//div")) ;
		driver.get("https://demo.guru99.com/test/upload/");    
		driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\1B\\crowedplace.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		Thread.sleep(3000);
		//TakesScreenshot ts =((TakesScreenshot)driver);
		//File f = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(f, new File("C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\Screenshots\\image1.png"));
//Base.FailedScreenshot(driver, "UploadFile.jpg");				
		driver.quit();
	}

}
