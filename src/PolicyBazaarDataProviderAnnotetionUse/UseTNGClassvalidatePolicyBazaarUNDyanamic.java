package PolicyBazaarDataProviderAnnotetionUse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonUseMethods.CommonMethods;

public class UseTNGClassvalidatePolicyBazaarUNDyanamic
{
	//declare driver globally because access for all
	WebDriver driver;
	LoginPagePBDyanamic login;
	myAccountPagePBDyanamic myacc;//create object of 2 pom classes
	
	
	@BeforeMethod
	public void LoginToPolicyBazaar() throws EncryptedDocumentException, IOException
	{
		//initilise driver
				driver=new ChromeDriver();
				driver.get("https://www.policybazaar.com/?");
				driver.manage().window().maximize();
				//intiolise Objects
				//object ethe ka initilise kele karan aaplyala driver parameter pass kraycha hota mahnun
				login=new LoginPagePBDyanamic(driver);
				myacc=new myAccountPagePBDyanamic(driver);
				//use CommonMethods
				
		
	} 
	
  @Test(dataProvider = "PolicyData",dataProviderClass = PolicyBazaarTestData.class)
  public void VarifyValidateUN(String MobNo,String Password,String ExpUN)  
  {
	  CommonMethods.implicitwait(driver,1000);
		login.ClickOnHomePageSignInBtn();
		CommonMethods.implicitwait(driver,1000);
		login.entermobileno(MobNo);
		CommonMethods.implicitwait(driver,1000);
		login.ClickOnSignInWithPassword();
		CommonMethods.implicitwait(driver,1000);
		login.enterPassword(Password);
		CommonMethods.implicitwait(driver,1000);
		login.clicksignInButton();
		CommonMethods.implicitwait(driver,1000);
		login.ClickOnMyAccount();
		CommonMethods.implicitwait(driver,1000);
		login.ClickOnMyProfile();
		
		//change focus from mainPage to Child page use getWindowHandles method
		Set<String> allPageId = driver.getWindowHandles();
		//convert set of string into array list
		
		//also we  can convert set of String into list use up casting
		//List<String>id=new ArrayList<>(allPageId);
		ArrayList<String>id=new ArrayList<>(allPageId);
		
		//in back end generate 2 id's ,0-->for main page and 1--> for childPage
		//String MainPageid = id.get(0);
		String childPageId = id.get(1);
		
		//now change focus from main page to child page using child page id
		driver.switchTo().window(childPageId);
		CommonMethods.implicitwait(driver,3000);
	  String expectedUN =ExpUN;
	  
	  String actualUN = myacc.getActualUN();
	 Reporter.log("Validate UN is==> "+actualUN,true);
	  CommonMethods.implicitwait(driver,2000);

	 //use asserts for verification
	  Assert.assertEquals(expectedUN, actualUN,"actual and expected are not matching TC fail");
	  
	  	  
  }
  @AfterMethod
  public void logoutFromPolicyBazaar()
  {
	  CommonMethods.implicitwait(driver,2000);
	  myacc.clickonLogoutButton();

	  CommonMethods.implicitwait(driver,3000);
	  driver.quit();
	  
  }
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
