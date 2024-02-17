package com.hyr.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicControls {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.findElement(By.id("firstName")).sendKeys("Ashok");
		driver.findElement(By.id("femalerb")).click();		
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		Thread.sleep(3000);
		driver.quit();		
	}

}
