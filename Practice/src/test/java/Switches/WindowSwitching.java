package Switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching 
{

	public static void main(String[] args)
	{
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//driver.switchTo().newWindow(WindowType.TAB); //TAB used for open the link in tab
		driver.switchTo().newWindow(WindowType.WINDOW); //used for switch first window and open new window
		
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		
		
	}

}
