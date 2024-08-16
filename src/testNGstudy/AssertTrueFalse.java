package testNGstudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {
  @Test
  public void asserttrueorfalse() {
	boolean a=true;
	boolean b=false;
	//Assert.assertTrue(b, "It is not true, TC failed");//failed
	//Assert.assertTrue(a,"It is false ,TC failed");
	
	Assert.assertFalse(b, "It is true ,TC failed");//Passed
	//Assert.assertFalse(a, "It is true ,TC failed");//Failed
	
	Assert.fail();//It is used to fail the test cases intensionally
  }
}
