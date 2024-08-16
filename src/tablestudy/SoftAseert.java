package tablestudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAseert {
  @Test
  public void f() {
	  String a="Pune";
	  String b="Pune";
	  String c="Mumbai";
	  SoftAssert soft= new SoftAssert();
	  soft.assertEquals(a,b,"a and b are not equal,TC failed");
	  soft.assertNotNull(b,"It is null TC is failed");
//	  soft.assertNull(a,"It is not null,TC failed");
//	  soft.assertNotEquals(b, c,"They are equal,TC failed");
//	  soft.assertEquals(b, c,"They are not equal,TC failed");
	  
	  soft.assertAll();
  }
}
