package testNGstudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void assertnull() {
	  String a=null;
	  String b="abc";
	  //Assert.assertNull(b,"b is not null TC failed");
	  //Assert.assertNull(a,"a is not null TC failed");
	  
	  Assert.assertNotNull(b,"value is null TC failed");//passed
	  //Assert.assertNotNull(a,"value is null TC failed");//failed
  }
}
