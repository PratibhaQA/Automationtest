package Switches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSwitching
{

	public static void main(String[] args) 
	{
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
      
    //  driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));//using locators
      driver.switchTo().frame(0);   //by using the indexing we also switch the frame
      
      driver.findElement(By.linkText("org.openqa.selenium"));
      driver.switchTo().defaultContent();
      
      driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
      driver.findElement(By.linkText("FirefoxDriver")).click();
      driver.switchTo().defaultContent();
      
      driver.switchTo().frame(driver.findElement(By.name("classFrame")));
      driver.findElement(By.linkText("builder")).click();
      driver.switchTo().defaultContent();
      
      driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
      driver.findElement(By.linkText("Alert")).click();
      driver.switchTo().defaultContent();
      
      driver.switchTo().frame(driver.findElement(By.name("classFrame")));
      driver.findElement(By.linkText("getText")).click();
      
		
		
	}

}

