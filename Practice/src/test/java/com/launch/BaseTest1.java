package com.launch;

import java.io.FileInputStream;
import java.lang.StackWalker.Option;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.w3c.dom.UserDataHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest1
{

    public static WebDriver driver;
    
    public static String projectpath=System.getProperty("user.dir");
    public static Properties p;
    public static Properties MainProp ;
    public static Properties ChildProp;
    
    
    public static void init() throws Exception
    {
    	FileInputStream fis = new FileInputStream("E:\\Java workspace\\Practice\\src\\test\\resources\\data.properties");
    	//FileInputStream fis = new FileInputStream(projectpath+"src\\test\\resources\\data.properties");
        p= new Properties();
    	p.load(fis);
    	//String e = p.getProperty("chromebrowser");
    	//System.out.println(e);
    	
    	//fis=new FileInputStream(projectpath+"src\\test\\resources\\environment.properties");
    	fis=new FileInputStream("E:\\Java workspace\\Practice\\src\\test\\resources\\enviornment.properties");
        MainProp = new Properties();
    	MainProp.load(fis);
    	String a = MainProp.getProperty("env");
    	System.out.println(a);
    	
    	fis = new FileInputStream("E:\\Java workspace\\Practice\\src\\test\\resources\\"+a+".Properties");
    	ChildProp=new Properties();
    	ChildProp.load(fis);
    	String url = ChildProp.getProperty("amazonurl");
    	System.out.println(url);
    	
  }
	
    
	public static void launch(String browser)
	{
		
		if (p.getProperty(browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
		   // driver = new ChromeDriver();
		    ChromeOptions options=new ChromeOptions();
		    
		    options.addArguments("user-data-dir=C:\\Users\\admin\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 4");
			//driver.get("https://www.amazon.com");
		    
		    options.addArguments("--disable-notification");
		    options.addArguments("--start-maximized");
		   // options.addArguments("--proxy-server=https://192.122.12.1.9090");
		    //options.addArguments("--ignore-certificate-errors-spki-list");
		    
		    driver=new ChromeDriver(options);
		    
			
		}else  if (p.getProperty(browser).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			
			
			driver = new FirefoxDriver();
			// driver.get("https://www.hdfccom.in");
			
		}else if(p.getProperty(browser).equals("Microsoft Edge"))
		{
			
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
			//driver.get("https://www.w3school.com");
			
		}
	
	}
	public static void navigate(String url)
	{
		driver.get(ChildProp.getProperty(url));
	}
	
	


}


