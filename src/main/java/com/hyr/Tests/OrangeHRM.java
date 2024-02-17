package com.hyr.Tests;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert.*;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void InitialiseBrowser(@Optional("chrome") String browserName) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok_b01\\eclipse-workspace\\PracticeTestNG\\resources\\chromedriver.exe" );  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		
		/*switch(browserName.toLowerCase())
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Browser name is invalid");
			break;		*/
	}
	
	@AfterTest
	public void TearDown(Long sleepTime) throws Exception {
		//String sleepTime = "3000";
		//Thread.sleep(Long.valueOf(sleepTime));
		Thread.sleep(sleepTime);
		driver.quit();
	}
	
	@Parameters("url")
	@Test
	public void LaunchApp(String url)
	{		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.get(url);
	}
	
	@Parameters({"userName", "password"})
	@Test
	public void EnterLoginDetails(String userName, String password) {
		//driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();		
	}
	
	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	
	@Test
	public void VerifyMyInfo() {
		//System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
		assertTrue(driver.findElement(By.id("employee-details")).isDisplayed());
	}
	
	@Test
	public void VerifyLogin() {
		WebElement element = driver.findElement(By.id("welcome"));
		assertTrue(element.isDisplayed());
		assertTrue(element.getText().startsWith("welcome"));
		/*if(driver.getPageSource().contains("Paul Collings"))
		{
			System.out.println("Logged In");
		}
		else
		{
			System.out.println("Logged Failed");
		}*/
	}
	
}
