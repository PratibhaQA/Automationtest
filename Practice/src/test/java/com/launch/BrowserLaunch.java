package com.launch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{

	public static void main(String[] args)
	{
      WebDriverManager.chromedriver().setup();
      ChromeDriver ob= new ChromeDriver();
      
      WebDriverManager.firefoxdriver().setup();
      FirefoxDriver obj = new FirefoxDriver();
      
      WebDriverManager.edgedriver().setup();
      EdgeDriver obj1=new EdgeDriver();
	}

}
