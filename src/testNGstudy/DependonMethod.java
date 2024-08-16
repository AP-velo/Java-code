package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependonMethod {
  @Test(priority=-5,dependsOnMethods= {"f1"})
  public void f() {
	  Reporter.log("This is f method ", true);
  }
  
  @Test(priority=-4)
  public void f1()
  {
	  Reporter.log("This is f1 method", true);
  }
  
  @Test()
  public void f2()
  {
	  Reporter.log("This is the f2 method", true);
  }
}
