package dataproviderTestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Utilitydataprovider {
	//Put data inside the Dataprovider
	@DataProvider(name="Playersname")
	public String[][] mydata() throws EncryptedDocumentException, IOException
	{
		String testdata[][]= read_datafromexcel("Excel2","Sheet1");
		return testdata;
	}
	
	public static String[][] read_datafromexcel(String Excelname,String sheetname) throws EncryptedDocumentException, IOException
	{
		String path=System.getProperty("user.dir")+"\\+Excelname+.xlsx";
		System.out.println(path);
		FileInputStream myfile= new FileInputStream("path");
		Sheet sheet=WorkbookFactory.create(myfile).getSheet(sheetname);
		int countrowno=sheet.getLastRowNum();
		int countcolumnno=sheet.getRow(0).getLastCellNum()-1;
		System.out.println(countcolumnno);
		String data[][]= new String[countrowno+1][countcolumnno+1];
		for(int i=0;i<=countrowno;i++)
		{
			for(int j=0;j<=countcolumnno;j++)
			{
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j]=value;
			}
		}
		return data;
		
	}

}
