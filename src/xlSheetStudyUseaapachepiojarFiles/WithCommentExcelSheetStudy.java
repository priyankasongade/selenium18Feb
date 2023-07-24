package xlSheetStudyUseaapachepiojarFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WithCommentExcelSheetStudy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("/home/ubuntu/Desktop/xlsheet.xlsx");
//		double value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
//		System.out.println(value);
		
//		String stringvalue = WorkbookFactory.create(file).getSheet("sheet2").getRow(1).getCell(1).getStringCellValue();
//		System.out.println(stringvalue);
		
		boolean stringvalue = WorkbookFactory.create(file).getSheet("sheet2").getRow(2).getCell(2).getBooleanCellValue();
		System.out.println(stringvalue);
	
	}

}
