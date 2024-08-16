package dataproviderTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	@DataProvider(name="Student")
	@Test
  public String[][] f() {
	  String s1[][]= {{"Abhijeet","Pawar","9428318014"},{"Aniket","Patil","8160350195"},{"Shalini","Singh","7724362810"}};
	  return s1;
  }
	@DataProvider(name="Teacher")
	@Test
	public String[][] f1()
	{
		String s2[][]= {{"Prajwal","Chauhan","6622334455"},{"Shivam","Patel","8883337771"}};
		return s2;
	}
}
