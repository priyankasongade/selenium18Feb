package commonUseMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {

	//here only create common methods and run this static methods in another class using syntax(classname.methodname)
	//common methods create only implicitWait,screenshot,Scrolling,read data from Excel Sheet
	
	//1.Wait
	public static void implicitwait(WebDriver driver,long waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	//2.ScrrenShots
	public static void captureScreenShot(WebDriver driver,String filename) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("/home/ubuntu/Desktop/Priyanka/CpatureScreenShots"+filename+".png");
		FileHandler.copy(source, Destination);
	}
	//3.Scrolling
	public static void scrollIntoView(WebDriver driver,WebElement Element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true))",Element);	
	}
	//read data from Excel Sheet
	//aaplyala return string bhetnar mahnun return type void nahi only use String
	public static String readDataFromExcel(int rowNo,int cellNo) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("/home/ubuntu/Desktop/Priyanka/policyBazaarTestData.xlsx");
		String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(rowNo).getCell(cellNo).getStringCellValue();
		return value;//aani return krtana tyacha variable return kraycha
		
	}
	

}
