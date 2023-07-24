package xlSheetStudyUseaapachepiojarFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MobileNoReadUsingExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("/home/ubuntu/Desktop/Demo.xlsx");
		Sheet mysheet = WorkbookFactory.create(file).getSheet("sheet1");
		//find cell type
//		System.out.println(mysheet.getRow(0).getCell(2).getCellType());
//		System.out.println(mysheet.getRow(0).getCell(2).getNumericCellValue());
		
		//covert mobile no. into string using "'"
		System.out.println(mysheet.getRow(0).getCell(2).getCellType());
		System.out.println(mysheet.getRow(0).getCell(2).getStringCellValue());
		
		
	}

}
