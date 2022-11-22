package Actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseAction2
{

	public static void main(String[] args) 
	{
      WebDriver driver= new FirefoxDriver();
      driver.get("https:www.amazon.in");
      driver.manage().window().maximize();
      
      Actions action=new Actions(driver);
       WebElement element = driver.findElement(By.linkText("Today's Deals"));
       action.moveToElement(element).click().build().perform();
      // action.click().build().perform();
       
       
       WebDriverWait  wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='a-page']/div[@id='slot-15']/div[@id='slot-15']/div[1]/div[1]/div[2]/div[2]/span[1]/ul[1]/li[1]/div[1]/a[1]/span[1]")));

       //not working
       WebElement element2 =driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='slot-15']/div[@id='slot-15']/div[1]/div[1]/div[2]/div[2]/span[1]/ul[1]/li[1]/div[1]/a[1]/span[1]"));
       action.moveToElement(element2).click().build().perform();
	  // action.click().build().perform();
	}

}
