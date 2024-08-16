import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelpractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream myfile= new FileInputStream("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx");
//		String pincode=WorkbookFactory.create(myfile).getSheetAt(1).getRow(0).getCell(0).getStringCellValue();
//		System.out.println(pincode);
		
		Sheet mysheet=WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value=mysheet.getRow(1).getCell(3).getStringCellValue();
		System.out.println(value+" ");
		//column reading
		for(int i=0;i<=3;i++)
		{
			String mydata = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(mydata+" ");
		}
		
		//Row Reading
		for(int i=0;i<=3;i++)
		{
			String myrowdata=mysheet.getRow(1).getCell(i).getStringCellValue();
			System.out.print(myrowdata+" ");
		}
			
		
	}
	

}
