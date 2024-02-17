package com.hyr.Tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlesDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle: windowHandles)
		{
			System.out.println(handle);
			if(!handle.equals(parentHandle))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Child Ashok");
				Thread.sleep(3000);
				driver.close();
			}
			driver.switchTo().window(parentHandle);
			driver.findElement(By.id("name")).sendKeys("Parent Ashok");
			Thread.sleep(3000);
			//driver.quit();
			
		}
		
		}
	}

