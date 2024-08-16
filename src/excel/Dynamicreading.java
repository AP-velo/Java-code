package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dynamicreading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx");
		Sheet sheet1=WorkbookFactory.create(file).getSheet("Sheet1");
		
		int totalnumofrows=sheet1.getLastRowNum();
		System.out.println(totalnumofrows);
		
		short cellnum=sheet1.getRow(0).getLastCellNum();
		System.out.println(cellnum);
		int totalnumofcell=cellnum-1;
		System.out.println(totalnumofcell);
		
		for(int i=0;i<=totalnumofrows;i++)
		{
			for(int j=0;j<=totalnumofcell;j++)
			{
				Cell celltype=sheet1.getRow(i).getCell(j);
				CellType mycell=celltype.getCellType();
				if(mycell==CellType.NUMERIC)
				{
					double value=celltype.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(mycell==CellType.BOOLEAN)
				{
					boolean value=celltype.getBooleanCellValue();
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
