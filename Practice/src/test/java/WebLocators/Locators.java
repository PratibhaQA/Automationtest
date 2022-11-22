package WebLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators 
{

	public static void main(String[] args)
	{

      WebDriver driver=new ChromeDriver();
      makeProfile(driver);
      userLogIn(driver);
     // submitAccount(driver);
      
      
	
	}
	
	private static void makeProfile(WebDriver driver)
	{
		 driver.get("https://www.meesho.com/");
		 driver.manage().window().maximize();
	      WebElement makeProfileId = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[3]/div[5]/*[1]"));
	      makeProfileId.click();
	}


	private static void userLogIn(WebDriver driver)
	{
     
	WebElement signUp = driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]"));
	signUp.click();
	WebElement phoneNo = driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]\r\n"
			+ ""));
	phoneNo.sendKeys("8567883217");
	
	WebElement submit = driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[2]/div[1]/button[1]/div[1]"));
	submit.click();
	   
	}
	
	//private static void submitAccount(WebDriver driver)
	{
       
		
	}

	
}
