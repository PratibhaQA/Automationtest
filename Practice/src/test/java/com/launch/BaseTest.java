package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	
	public static void launch(String browser)
	{
		if (browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			
		}else  if (browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 driver.get("https://www.google.com");
			
		}else if(browser.equals("Microsoft Edge"))
		{
			
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
			driver.get("https://www.w3school.com");
			
		}
	
	}
	public static void navigate(String url)
	{
		driver.get(url);
	}
	
	


}
