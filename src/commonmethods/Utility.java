package commonmethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility {

		
		public static void scrollIntoView(WebDriver driver,WebElement element) 
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",element);
			
		}
		
		public static void takescreenshot(WebDriver driver,String filename) throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File dest=new File("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Pictures\\Screenshots\\"+filename+".png");
			
			FileHandler.copy(src, dest);
		}
		
		public static String takethedatafromexcel(String filepath, String sheet,int row,int column) throws EncryptedDocumentException, IOException
		{
			FileInputStream file= new FileInputStream(filepath);
			String value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
			return value;
		}


}
