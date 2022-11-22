package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_003 extends BaseTest1
{

	public static void main(String[] args) throws Exception 
	{
      
		init();
		launch("chromebrowser");
		navigate("amazonurl");
		// selectOption = ("searchDropdownBox","Books");
		// typeText = ("field-keywords","Harry Potter");
	    // clickElement = ("//*[@id=\\\"nav-search-submit-button\\\"]");
		
		
		//WebElement loc = driver.findElement(By.id(""));
		//loc.sendKeys("books");
	      driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		  driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		  
		  
		  
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		
		
		
	}

}
