package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
  @Test
  public void f() {
	  Reporter.log("This is f method", true);
  }
  
  @Test(enabled=false)
  public void f1()
  {
	  Reporter.log("This is f1 method", true);
  }
  
  @Test
  public void f2()
  {
	  Reporter.log("This is f2 method", true);
  }
}
