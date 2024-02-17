package com.hyr.Others;

import org.openqa.selenium.By;
import org.testng.annotations.*;

@Listeners(com.hyr.Others.TestStatusListener.class)
public class Testcases extends Base {

	@BeforeTest
	public void setup()
	{
		initialiseBrowser();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void ScreenshotTest1()
	{		
		System.out.println("Driver:"+driver.toString());
		driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\1B\\crowedplace.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		//assertTrue(false);
	}
	
}
