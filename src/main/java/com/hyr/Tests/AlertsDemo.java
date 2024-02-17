package com.hyr.Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		/*driver.findElement(By.id("alertBox")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		Thread.sleep(3000);
		simpleAlert.accept();*/
		
		/*driver.findElement(By.id("confirmBox")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());
		Thread.sleep(3000);
		//confirmationAlert.accept();
		confirmationAlert.dismiss();
		
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.id("output")).getText());
		*/
		
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		Thread.sleep(3000);
		promptAlert.sendKeys("Ashok");
		Thread.sleep(3000);
		promptAlert.accept();
		//promptAlert.dismiss();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		driver.quit();
		
	}

}
