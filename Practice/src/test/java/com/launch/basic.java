package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\Drivers\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https:www.google.com");
	       driver.manage().window().maximize();

	}

}
