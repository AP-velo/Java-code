package testNGstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class InvocationCount {
  @Test(invocationCount=2)
  public void f() {
	  Reporter.log("This is f method", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is before method", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("This is after method", true);
  }

}
