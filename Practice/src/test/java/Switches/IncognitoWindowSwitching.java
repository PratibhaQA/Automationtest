package Switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoWindowSwitching
{

	public static void main(String[] args) 
	{
      
		 WebDriverManager.chromedriver().setup();
		 
		  ChromeOptions options=new ChromeOptions();
		  options.addArguments("--Incognito");
	       
		  WebDriver driver = new ChromeDriver(options);
	        
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			System.out.println(driver.getTitle());
	}

}
