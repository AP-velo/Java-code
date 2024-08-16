package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Wholetablereadingdifferentdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx");
		Sheet sheet1=WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				Cell mydata=sheet1.getRow(i).getCell(j);
				CellType celltype=mydata.getCellType();
				if(celltype==CellType.NUMERIC)
				{
					double value=mydata.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(celltype==CellType.BOOLEAN)
				{
					boolean value=mydata.getBooleanCellValue();
					System.out.print(value+" ");
				}
				else
				{
					String value=mydata.getStringCellValue();
					System.out.print(value+" ");
				}
			}
			System.out.println();
		}
	}

}
