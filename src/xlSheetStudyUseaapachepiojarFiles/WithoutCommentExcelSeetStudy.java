package xlSheetStudyUseaapachepiojarFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WithoutCommentExcelSeetStudy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("/home/ubuntu/Desktop/xlsheet.xlsx");
		Workbook myworkbook = WorkbookFactory.create(file);
		Sheet mysheet = myworkbook.getSheet("sheet2");
		Row myrow = mysheet.getRow(0);
		Cell mycell = myrow.getCell(0);
		
		CellType mycelltype = mycell.getCellType();
		System.out.println(mycelltype);
		
		System.out.println(mycell.getNumericCellValue());
		
	}

}

