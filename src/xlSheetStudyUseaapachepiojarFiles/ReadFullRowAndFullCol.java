package xlSheetStudyUseaapachepiojarFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFullRowAndFullCol {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("/home/ubuntu/Desktop/xlsheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(file).getSheet("sheet2");
		//find full row
		//row=constant and cloumn= change
		//use for loop
		for(int i=0;i<=2;i++)//row index=0=constant and cell index 2=changeing
		{
			 String wholerow = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(wholerow+" ");//only 1 row line print
		}
		System.out.println();
		//find full cloumn
		//row=change and column=constant
		//use for loop
		for(int i=0;i<=1;i++)//row index=1=changing  and cell index 0 =constant
		{
			 String wholecol = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.print(wholecol+" ");
		}
		
	}
	

}
