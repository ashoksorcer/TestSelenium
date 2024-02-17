package com.hyr.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.qafox.com/selenium/selenium-practice/");
		//driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		//WebElement element = driver.findElement(By.tagName("input"));
		//driver.findElement(By.cssSelector("#loginbutton>input")).click();
		//driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
		driver.findElement(By.linkText("QAFox - Software Testing")).click();
		//driver.findElement(By.partialLinkText("Forgotten?")).click();
		//driver.findElement(By.className("c-esuXKx c-esuXKx-ldClmX-variant-link forgot-password")).click();
	}

}
