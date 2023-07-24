package POMPolicyBazaarSatitcCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonUseMethods.CommonMethods;

public class TestUserNamePB {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		
		//use wait
		CommonMethods.implicitwait(driver, 1000);
		
		//click on sign in btn
		//create object of PBLoginPage
		LoginPagePB lp=new LoginPagePB(driver);
		lp.Homepagesigninbtn();
		Thread.sleep(500);
		
		lp.entermobileno();
		Thread.sleep(500);
		
		lp.SignInWithPassword();
		Thread.sleep(500);
		
		lp.enterPassword();
		Thread.sleep(500);
		
		lp.clicksignInButton();
		Thread.sleep(500);
		
		lp.MyAccount();
		Thread.sleep(500);
		
		lp.MyProfile();
		Thread.sleep(500);
		//next tab open 
		//we need to switch to focus on new window use get window handle
		 Set<String> allid = driver.getWindowHandles();
		 List<String> al= new ArrayList<>(allid);

		//switching focus to myAccount page
		driver.switchTo().window(al.get(1));

		//create object of 2nd webpage myAccountPage class
		Thread.sleep(500);
		myAccountPagePB myAcc= new myAccountPagePB(driver);
		myAcc.validateUserName();
		Thread.sleep(1000);

		driver.quit();
	
	}
}
