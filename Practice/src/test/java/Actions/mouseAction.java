package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseAction
{

	public static void main(String[] args)
	{
       WebDriver driver=new FirefoxDriver();
       driver.get("https:www.ebay.com");
       driver.manage().window().maximize();
       
       Actions action=new Actions(driver);
      
       WebElement element = driver.findElement(By.linkText("Electronics"));
       action.moveToElement(element).build().perform();
       //action.click().build().perform();
       
       WebDriverWait  wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Smart watches")));
       
       WebElement element2 = driver.findElement(By.linkText("Smart watches"));
       action.moveToElement(element2);
       action.click().build().perform();
       
       System.out.println(driver.getCurrentUrl());
       
       
       
	}

}
