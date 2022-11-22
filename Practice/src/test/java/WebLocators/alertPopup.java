package WebLocators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class alertPopup 
{

	public static void main(String[] args) throws Exception
	{
	  //System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\Drivers\\chromedriver.exe");
       WebDriver driver=new FirefoxDriver();
       
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       driver.manage().window().maximize();

       
       driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
       Alert alert = driver.switchTo().alert();
       alert.accept();
       String result = driver.findElement(By.cssSelector("#result")).getText();
       System.out.println(result);
       Assert.assertEquals("You Successfully clicked an alert", result);
       
       //not execute find error is remaining
       driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
       Alert alert1 = driver.switchTo().alert();
       alert1.dismiss();
       String result1 = driver.findElement(By.xpath("//p[@id='result']")).getText();
       System.out.println(result1);
       Assert.assertEquals("You Clicked on cancel", result1);
      
       //not execute find error is remaining
       
       driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
       Alert alert2 = driver.switchTo().alert();
       alert2.accept();
       String result2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
       System.out.println(result2);
       Assert.assertEquals("You Clicked on Ok", result2);
              
       
       
       
		
		
	}

}
