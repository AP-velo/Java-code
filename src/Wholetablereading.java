import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Wholetablereading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream myfile= new FileInputStream("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx");
		Sheet mysheet=WorkbookFactory.create(myfile).getSheet("Sheet2");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String wholedata=mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(wholedata+" ");
			}
		}
	}

}
