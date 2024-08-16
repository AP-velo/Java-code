package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGSuite2 {
  @Test(groups="Regression")
  public void e() {
	  Reporter.log("This is e method", true);
  }
  
  @Test(groups="Regression")
  public void f() {
	  Reporter.log("This is f method", true);
  }
  
  @Test(groups="Sanity")
  public void g() {
	  Reporter.log("This is g method", true);
  }
  
  @Test(groups="Sanity")
  public void h() {
	  Reporter.log("This is h method", true);
  }
}
