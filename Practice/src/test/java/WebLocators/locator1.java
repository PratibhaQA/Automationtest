package WebLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator1 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
	      signInProfile(driver);
	      createNewUser(driver);
		
	}
	private static void signInProfile(WebDriver driver)
	{
      driver.get("https:/www.amazon.in");	
      driver.manage().window().maximize();
      WebElement signInAccount = driver.findElement(By.className("//a[@class='nav-action-button']"));
      signInAccount.click();
	}
	

	private static void createNewUser(WebDriver driver)
	{
      WebElement createNewAcount = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
      createNewAcount.click();
      
      WebElement Name = driver.findElement(By.className("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"));
      Name.sendKeys("Pratibha");
      
      WebElement phoneNo = driver.findElement(By.id("//input[@id='ap_phone_number']"));
      phoneNo.sendKeys("8378939376");
      
      WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']\r\n"));
      email.sendKeys("pratibhakale@gmail.com");
      
      WebElement password = driver.findElement(By.id("//input[@id='ap_password']"));
      password.sendKeys("Praribha@1234");
      
     WebElement submit = driver.findElement(By.className("//input[@class='a-button-input']"));
     submit.click();
     
     driver.close();
      
      
	}

}
