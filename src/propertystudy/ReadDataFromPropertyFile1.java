package propertystudy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadDataFromPropertyFile1 {
	public static String readdatafrompropertyfile(String key) throws IOException
	{
		FileInputStream myfile= new FileInputStream(System.getProperty("user-dir")+"\\fbTest.properties");
		Properties prop = new Properties();
		prop.load(myfile);
		String value=prop.getProperty(key);
		System.out.println(value);
		return value;
	}

}
