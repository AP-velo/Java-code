package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywords {
  @Test(priority=1)
  public void f() {
	  Reporter.log("This is f method",true);
  }
  
  @Test(priority=-4)
  public void f1()
  {
	  Reporter.log("This is f1 method", true);
  }
  
  @Test(dependsOnMethods= {"f1"})
  public void f2()
  {
	  Reporter.log("This is f2 method", true);
  }
  
  @Test(enabled=false)
  public void f4()
  {
	  Reporter.log("This is f4 method", true);
  }
}
