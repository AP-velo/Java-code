package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Marks {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// Printing the original marks as String
		FileInputStream file= new FileInputStream("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx");
		String marks=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(marks);
	}

}
