package TestNGPOMPolicyBazaarStaticCoding;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UseTNGClassvalidatePolicyBazaarUNStatic
{
	//declare driver globally because access for all
	WebDriver driver;
	LoginPagePB login;
	myAccountPagePB myacc;//create object of 2 pom classes
	
	@BeforeClass
	public void launchpolicyBazaar()
	{
		//initilise driver
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/?");
		driver.manage().window().maximize();
		//intiolise Objects
		//object ethe ka initilise kele karan aaplyala driver parameter pass kraycha hota mahnun
		login=new LoginPagePB(driver);
		myacc=new myAccountPagePB(driver);		
		
	}
	@BeforeMethod
	public void LoginToPolicyBazaar()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.ClickOnHomePageSignInBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.entermobileno();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.ClickOnSignInWithPassword();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.enterPassword();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.clicksignInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.ClickOnMyAccount();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.ClickOnMyProfile();
		
		//change focus from mainPage to Child page use getWindowHandles method
		Set<String> allPageId = driver.getWindowHandles();
		//convert set of string into array list
		
		//also we  can convert set of String into list use up casting
		//List<String>id=new ArrayList<>(allPageId);
		ArrayList<String>id=new ArrayList<>(allPageId);
		
		//in back end generate 2 id's ,0-->for main page and 1--> for childPage
		//String MainPageid = id.get(0);
		String cildPageId = id.get(1);
		
		//now change focus from main page to child page using child page id
		driver.switchTo().window(cildPageId);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
  @Test
  public void VarifyValidateUN() 
  {
	  String expecUN = "Priyanka Dilip Jadhav";
	  
	  String actualUN = myacc.getActualUN();
	  Reporter.log("Validate UN is==> "+actualUN,true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	  //use AssertEqualMethod for verification
	  Assert.assertEquals(expecUN, actualUN,"if actual and expected notmatch then TC fail");	  
	  	  
  }
  @AfterMethod
  public void logoutFromPolicyBazaar()
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  myacc.clickonLogoutButton();
	  
  }
  @AfterClass
  public void CloseBrowser()
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.quit();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
