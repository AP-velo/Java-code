package testNGstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class EveryAnnotation {
  @Test
  public void f() {
	 Reporter.log("This is f method", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is before method", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("This is After method", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("This is before class method", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("This is after class method ", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("This is bofore suit method", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("This is after suite method", true);
  }

}
