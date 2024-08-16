package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void takeScreenShot(WebDriver driver,String filename) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest= new File(System.getProperty("user.dir")+"\\ScreenshotFolder\\"+filename+".png");
		
		FileHandler.copy(src, dest);
	}
	
	public static String readDataFromExcel(String filepath,String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile= new FileInputStream(filepath);
		String value=WorkbookFactory.create(myfile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	}
	
	public static String readDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream myfile1= new FileInputStream(System.getProperty("user.dir")+"\\propertfile.properties");
		Properties property= new Properties();
		property.load(myfile1);
		String value=property.getProperty(key);
		return value;
	}
}
