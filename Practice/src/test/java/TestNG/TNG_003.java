package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TNG_003
{
	@BeforeMethod
	  public void beforeMethod()
	  {
		  System.out.println("beforeMethod");
	  }
  @Test (priority=2)
  public void f()
  {
	  System.out.println("F");
  }
  
  @Test(priority=1)
  public void z()
  {
	  System.out.println("z");
  }
  
   @Test(priority=3)
  public void a()
  {
	  System.out.println("a");
  }
 
   @AfterMethod
  public void afterMethod()
  {
	  System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("afterTest");
  }

}
