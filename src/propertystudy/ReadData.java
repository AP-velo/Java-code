package propertystudy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		String path= System.getProperty("user-dir")+"\\fbTest.properties";
		// TODO Auto-generated method stub
		FileInputStream myfile= new FileInputStream(path);
		Properties prop= new Properties();
		prop.load(myfile);//Load the file
		String value=prop.getProperty("lastname");//Then we need to fetch the data
		System.out.println(value);
	}

}
