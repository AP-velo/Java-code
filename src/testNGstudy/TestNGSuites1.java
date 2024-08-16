package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGSuites1 {
  @Test(groups="Regression")
  public void a() {
	  Reporter.log("This is a method", true);  
  }
  
  @Test(groups="Sanity")
  public void b()
  {
	  Reporter.log("This is b method", true);
  }
  
  @Test(groups="Sanity")
  public void c()
  {
	  Reporter.log("This is c method", true);
  }
  
  @Test(groups="Regression")
  public void d()
  {
	  Reporter.log("This is d method", true);
  }
}
