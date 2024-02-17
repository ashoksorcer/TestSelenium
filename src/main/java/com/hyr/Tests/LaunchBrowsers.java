package com.hyr.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowsers {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	//options.addArguments("--start-maximized");
	//options.addArguments("--incognito");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.google.com");
}
}
