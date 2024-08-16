package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Rowandcolumnreading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile= new FileInputStream("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx");
		Sheet sheet1=WorkbookFactory.create(myfile).getSheet("Sheet1");
		System.out.println("Column reading");
		for(int i=0;i<=3;i++)
		{
			String mypage=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(mypage+" ");
		}
		System.out.println("==============================================");
		System.out.println("Row reading");
		for(int i=0;i<=3;i++)
		{
			String mypage1=sheet1.getRow(1).getCell(i).getStringCellValue();
			System.out.print(mypage1+" ");
		}
	}

}
