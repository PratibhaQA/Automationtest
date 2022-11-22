package WebLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_Path  
{

	public static void main(String[] args)
	{
      WebDriverManager.chromedriver().arch32().setup();
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://money.rediff.com/gainers");
      

 String price= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[4]")).getText();
     
      System.out.println(price);
		
		
      //table[@class='dataTable']/tbody/tr[5]/td[4]----This path is dynamic so we always chage ur outputs value 
      //and also we cant get always same company value, so its a dynamic way of xpath to finding value.
      
	}

}
