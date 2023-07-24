package xlSheetStudyUseaapachepiojarFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDatatypeUseAndFindFullSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("/home/ubuntu/Desktop/data.xlsx");
		Sheet mysheet = WorkbookFactory.create(file).getSheet("sheet1");
		
		//find total row
		int totalrowcount = mysheet.getLastRowNum();
		//find total cell count
		int totalcellcount = mysheet.getRow(0).getLastCellNum()-1;
		
		//outer for loop for row
		for(int i=0;i<=totalrowcount;i++)
		{
			//inner loop for cell
			for(int j=0;j<=totalcellcount;j++)
			{
				Cell mycell = mysheet.getRow(i).getCell(j);
				CellType mycelltype = mycell.getCellType();
				if(mycelltype==CellType.STRING)
				{
					System.out.print(mycell.getStringCellValue()+" ");		
				}
				else if(mycelltype==CellType.NUMERIC)
				{
					System.out.print(mycell.getNumericCellValue()+" ");
				}
				else if(mycelltype==CellType.BOOLEAN)
				{
					System.out.print(mycell.getBooleanCellValue()+" ");
				}
			    else if(mycelltype==CellType.BLANK)
				{
					System.out.print(" ");
				}			
			}
			System.out.println();
		}
		
	}

}
