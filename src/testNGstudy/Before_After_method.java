package testNGstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Before_After_method {
  @Test
  public void f() {
	  Reporter.log("This is f method", true);
  }
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("This is before class", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("This is afterclass", true);
  }

}
