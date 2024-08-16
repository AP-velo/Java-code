package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelpart1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream myFile= new FileInputStream("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx");

				//String value =WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				
				//int value1=(int) WorkbookFactory.create(myFile).getSheetAt(0).getRow(1).getCell(0).getNumericCellValue();
				boolean value2=WorkbookFactory.create(myFile).getSheetAt(0).getRow(0).getCell(1).getBooleanCellValue();

				System.out.println(value2);

	}

}
