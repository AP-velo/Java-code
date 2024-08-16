package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Wholetablereading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx");
		System.out.println("Reading the whole table:");
		Sheet sheet1=WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String mypage=sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(mypage+" ");
			}
			System.out.println();
		}
		
	}

}
