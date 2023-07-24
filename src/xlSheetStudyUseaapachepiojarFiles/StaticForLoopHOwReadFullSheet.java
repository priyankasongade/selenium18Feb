package xlSheetStudyUseaapachepiojarFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StaticForLoopHOwReadFullSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("/home/ubuntu/Desktop/xlsheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(file).getSheet("sheet2");
		//outer for loop=row
		for(int i=0;i<=1;i++)
		{
			//inner For loop=cell
			for(int j=0;j<=2;j++)
			{
				 String wholesheet = mysheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(wholesheet+" ");	
			}	
			System.out.println();
		}
		
	}

}
