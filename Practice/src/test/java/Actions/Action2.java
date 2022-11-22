package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action2
{

	public static void main(String[] args)
	{
     
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.meesho.com");
		 System.out.println(driver.getTitle());
		 Actions a= new Actions(driver);
		WebElement loc = driver.findElement(By.xpath("//span[contains(text(),'Profile')]"));
		a.moveToElement(loc).perform();
		driver.findElement(By.xpath("//span[contains(text(),'My Orders')]")).click();
	
		//a.contextClick().click();
		//driver.findElement(By.xpath("//div[@class=\"Input__InputContainer-sc-1goybxj-0 hwSOdA\"]")).click();
		
		 
	}

}
