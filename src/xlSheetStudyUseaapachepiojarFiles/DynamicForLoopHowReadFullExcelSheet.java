package xlSheetStudyUseaapachepiojarFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DynamicForLoopHowReadFullExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("/home/ubuntu/Desktop/xlsheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(file).getSheet("sheet2");
		System.out.println("--TotalRowCount----------------------------");
		//get row count
		int lastrownum = mysheet.getLastRowNum();
		System.out.println(lastrownum);
		
		int totalrowCount = lastrownum;
		System.out.println("--TotalcellCount-------------------------------");
		//get cell count
		 int lastcellnum = mysheet.getRow(0).getLastCellNum();
		 System.out.println(lastcellnum);
		 
		 int totalcellcount = lastcellnum-1;
		 System.out.println("--Full Sheet Read-------------------------------");
		 //use nested for loop
		 for(int i=0;i<=totalrowCount;i++)
		 {
			 for(int j=0;j<=totalcellcount;j++)
			 {
				 String wholesheetvalue = mysheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(wholesheetvalue+"  ");
			 }
			 System.out.println();
		 }
	}

}
