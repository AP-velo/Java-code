package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelpart2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file1= new FileInputStream("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx");
		
//		String name=WorkbookFactory.create(file1).getSheetAt(0).getRow(3).getCell(0).getStringCellValue();
//		System.out.println(name);
		//Sheet mysheet1=WorkbookFactory.create(file1).getSheet("Sheet1");
//		
//		int marks=(int) WorkbookFactory.create(file1).getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
//		System.out.println(marks);
		
//		boolean result=WorkbookFactory.create(file1).getSheetAt(0).getRow(2).getCell(2).getBooleanCellValue();
//		System.out.println(result);
		
		double marks=WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(marks);
	}

}
