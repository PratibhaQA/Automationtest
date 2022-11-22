package WebLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector 
{

	public static void main(String[] args)
	{
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		
      int pageMaxSize =driver.findElements(By.cssSelector("div#example_paginate>span>a")).size();
      System.out.println(pageMaxSize);
      
      for(int i=1;i<=pageMaxSize;i++)
      {
    	  
    	  
    	  
      }		
	}

}
