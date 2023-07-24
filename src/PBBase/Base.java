package PBBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import PBUtility.Utility;

public class Base 
{
	static protected WebDriver driver;
	//webDriver protected because webdriver use in diffrent package
	//driver static nahi kela tr takescrrenshot la nullpointer exseption yet mhnun
	//base class use driver and browser setup
	public void launchBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/?");	
		Reporter.log("Launching PolicyBazaar",true);
		
	}
	public void launchBrowserusingPropertyFile() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.policybazaar.com/?");
		//use property file
		driver.get(Utility.readDataFromPropertyFile("url"));
		Reporter.log("Launching PolicyBazaar",true);
		
	}
	public void CloseBrowser() throws InterruptedException
	{
		Utility.wait(1000);
		Reporter.log("ClosingBrowser..............",true);
		driver.quit();
	}

}
