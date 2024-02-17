package com.hyr.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement courseName = driver.findElement(By.id("course"));
		Select courseName_dd = new Select(courseName);
		
		//single selection
		courseName_dd.selectByIndex(1); //Java
		Thread.sleep(3000);
		/*courseName_dd.selectByValue("net"); //Dot net
		Thread.sleep(3000);
		courseName_dd.selectByVisibleText("Javascript"); //Javascript
		Thread.sleep(3000);*/
		
		WebElement ideName = driver.findElement(By.id("ide"));
		Select ideName_dd = new Select(ideName);
		
		ideName_dd.selectByIndex(0); //ec
		Thread.sleep(3000);
		
		ideName_dd.selectByValue("vs"); //vs
		Thread.sleep(3000);
		
		ideName_dd.selectByVisibleText("NetBeans");
		Thread.sleep(3000);
		
		/*ideName_dd.deselectByIndex(0); //ec
		Thread.sleep(3000);
		
		ideName_dd.deselectByValue("vs"); //vs
		Thread.sleep(3000);
		
		ideName_dd.deselectByVisibleText("NetBeans");
		Thread.sleep(3000);
		
		ideName_dd.deselectAll();
		Thread.sleep(3000);*/
		
		List<WebElement> ideNamesAllOptions = ideName_dd.getOptions();
		System.out.println("ideNames all options Available:");
		for (WebElement webElement: ideNamesAllOptions)
		{
			System.out.println(webElement.getText());
		}
		Thread.sleep(3000);
		
		List<WebElement> ideNamesSelected = ideName_dd.getAllSelectedOptions();
		System.out.println("Selected ideNames:");
		for (WebElement webElement: ideNamesSelected)
		{
			System.out.println(webElement.getText());
		}
		Thread.sleep(3000);
		
		WebElement ideNameFirstSelected = ideName_dd.getFirstSelectedOption();
		System.out.println("First selected IDeName");
		System.out.println(ideNameFirstSelected.getText());
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
