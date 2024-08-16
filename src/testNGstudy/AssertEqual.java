package testNGstudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqual {
  @Test
  public void assertequal() {
	  String a="Pune";
	  String b="Pune";
	  String c="Vaishali";
	  Assert.assertEquals(a, b,"a and b are not ,matching,TC failed");
	  Assert.assertEquals(a, c,"a and c are not matching,TC failed");
  }
  
  @Test
  public void assertnotequal()
  {
	  String a="Nagpur";
	  String b="Pune";
	  Assert.assertNotEquals(a, b,"a and are matching TC failed");
  }
}
