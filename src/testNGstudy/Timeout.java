package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
  @Test(timeOut=5000,priority=-4)
  public void f() throws InterruptedException {
//	  Thread.sleep(10000);//IF we write this in this function then it will get failed
	  Reporter.log("This is the f method", true);
  }
  
  @Test(priority=-5)
  public void f1()
  {
	  Reporter.log("This is f1 method", true);
  }
}
