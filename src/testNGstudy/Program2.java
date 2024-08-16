package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program2 {
	
@BeforeMethod
public void before_method()
{
	Reporter.log("This is beformethod", true);
}
	  
@BeforeMethod
public void before_method1()
{
	Reporter.log("This is before_method1", true);
}
  @Test
  public void f() {
	  Reporter.log("This is f method:", true);
  }

  
  @Test
  public void f1()
  {
	  Reporter.log("This is f1 method:", true);
  }
  
 @AfterMethod
 public void aftermethod()
 {
	 Reporter.log("This is aftermethod", true);
 }
}
