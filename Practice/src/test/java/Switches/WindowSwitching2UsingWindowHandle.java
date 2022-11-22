package Switches;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching2UsingWindowHandle
{

	public static void main(String[] args) 
	{
       WebDriverManager.chromedriver().setup();
       ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://www.icicibank.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        System.out.println(driver.getTitle());
        
        String ParentWindowId = driver.getWindowHandle();
        System.out.println(ParentWindowId);
		
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        
        
        while(!wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@class='img-fluid w-100']"))).isDisplayed())
        {
        	driver.findElements(By.xpath("//button[@class='slick-next slick-arrow']"));
        }
        
        driver.findElement(By.xpath("//img[@class='img-fluid w-100']")).click();
        Set<String> window = driver.getWindowHandles();
        ArrayList<String> nwinds=new ArrayList<String>(window);
        for(String i:nwinds)
        {
        	System.out.println(i);
        }
        driver.switchTo().window(((ArrayList<String>) window).get(1));
        System.out.println(driver.getTitle());
        
	}

}
