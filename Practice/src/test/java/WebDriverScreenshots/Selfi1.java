package WebDriverScreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class Selfi1 
{

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in");
       
       File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileHandler.copy(srcFile, new File("C:\\Users\\admin\\Desktop\\amazon.png"));
       
       
		 
		
	}

}
