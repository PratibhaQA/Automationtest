package WebDriverScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy4
{

	public static void main(String[] args) throws Exception
	{
      
		WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.google.com");
       
	       List<WebElement> link3 = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			
			for(int j=0;j<link3.size();j++)
			{
				
				Date dt=new Date();
				//System.out.println(dt);
				String d=dt.toString().replace(':', '_').replace(' ', '_');
				//System.out.println(d);
				
				String LinkName = link3.get(j).getAttribute("innerHTML");
				link3.get(j).click();
				
				 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 FileHandler.copy(srcFile, new File("C:\\Users\\admin\\Desktop\\Screenshots\\"+LinkName+"_"+d+".png"));
				 
				 link3=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
					
			}
				

	}

}
