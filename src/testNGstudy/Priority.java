package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority= -4)
  public void f() {
	  Reporter.log("This is f method", true);
  }
  
  @Test(priority=-5)
  public void f1()
  {
	  Reporter.log("This is f1 method", true);
  }
  
  @Test(priority=-4)
  public void f2()
  {
	  Reporter.log("This is f2 method", true);
  }
  
  @Test(priority=0)
  public void f3()
  {
	  Reporter.log("This is f3 method", true);
  }
}
