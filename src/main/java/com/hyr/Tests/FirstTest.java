package com.hyr.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {

	@Test
	public void TestGoogle() throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver","D:\\SoftwareCenterApplications\\geckodriver-v0.30.0-win64\\geckodriver.exe" );  
		//WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "/PracticeTestNG/resources/geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.navigate().to(null);
		driver.findElement(By.name("q")).sendKeys("Ashok", Keys.ENTER);
		String expectedTitle = "Ashok - Google Searchd";
		String actualTitle = driver.getTitle();
		//System.out.println(driver.getTitle());		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualTitle,expectedTitle, "Title is mismtached");
		//assertTrue(false);
		Thread.sleep(5000);
		driver.quit();	
		softAssert.assertAll();
	}
	
	@Test
	public void TestRetroTool() throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver","D:\\SoftwareCenterApplications\\geckodriver-v0.30.0-win64\\geckodriver.exe" );  
		//WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "/PracticeTestNG/resources/geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://retrotool.io/login");
		//driver.navigate().to(null);
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.name("email")).getAttribute("value"));
		Thread.sleep(5000);
		driver.quit();
	}
	
}
