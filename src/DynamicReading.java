import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DynamicReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream myfile= new FileInputStream("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx");
		Sheet mysheet=WorkbookFactory.create(myfile).getSheet("Sheet1");
		int rowno=mysheet.getLastRowNum();
		System.out.println(rowno);
		int mycell=mysheet.getRow(0).getLastCellNum();
		int totalnocolumns=mycell-1;
		System.out.println(totalnocolumns);
		
		for(int i=0;i<=rowno;i++)
		{
			for(int j=0;j<=totalnocolumns;j++)
			{
				Cell celltype=mysheet.getRow(i).getCell(j);
				CellType finalcelltype=celltype.getCellType();
				if(finalcelltype==finalcelltype.NUMERIC)
				{
					double value=celltype.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(finalcelltype==CellType.BOOLEAN)
				{
					Boolean value=celltype.getBooleanCellValue();
					System.out.print(value+" ");
				}
				else
				{
					String value=celltype.getStringCellValue();
					System.out.print(value+" ");
				}
			}
			System.out.println();
		}
	}

}
