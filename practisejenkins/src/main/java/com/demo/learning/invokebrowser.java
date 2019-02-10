package com.demo.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class invokebrowser {
	
	public WebDriver driver;
	
	
	@Parameters({"browser","url"})
	@Test
	public void test(String browser,String url) throws InterruptedException
	{
		
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		if(browser.equals("IE"))
		{
			System.out.println("ie is invoked");
			System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}
		 
		 //https://opensource-demo.orangehrmlive.com/
		 
		driver.get(url);
		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
