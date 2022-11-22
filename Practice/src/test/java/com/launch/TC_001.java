package com.launch;

public class TC_001 extends BaseTest1
{

	public static void main(String[] args) throws Exception 
	{
     
		init();
		launch("chromebrowser");
		navigate("amazonurl");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
	     System.out.println(url);
	     
	     driver.manage().deleteAllCookies();
	     
	     driver.navigate().back();
	     Thread.sleep(40000);
	     
	     driver.navigate().forward();
	     Thread.sleep(40000);
	     
	     driver.navigate().refresh();
	     
	     driver.close();
	     
	    // driver.quit();
	}

}
