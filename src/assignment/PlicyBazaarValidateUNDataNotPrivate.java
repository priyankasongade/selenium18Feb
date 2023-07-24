package assignment;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonUseMethods.CommonMethods;

public class PlicyBazaarValidateUNDataNotPrivate
{
	//when Test Data is not private
	//data visible to all
	

	public static void main(String[] args) throws InterruptedException
	{	
		//use chromeoptions for disable notifications
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		
		//use wait
		CommonMethods.implicitwait(driver, 1000);
		
		//click on sign in btn
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(1000);
		
		//enter mobile number
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9309053644");
		
		//Click on signin with password
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		Thread.sleep(1000);
		
		//enter password
		driver.findElement(By.name("password")).sendKeys("priya@jadhav");
		
		//click on sign in btn
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		CommonMethods.implicitwait(driver,1000);
		
		//click on myaccount
		driver.findElement(By.xpath("//div[text()='My Account']")).click();
		Thread.sleep(100);
		
		//click on myprofile
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		//new window open
		//we want to work on new child window
		//we need to change selenium focus from main page to child window//to switch to new window ===we should know windowid
		//use get window handles method
		
		Set<String> windowid = driver.getWindowHandles();
		
		//we are converting set object into arraylist
		ArrayList<String>al=new ArrayList<>(windowid);
		//String mainpageid = al.get(0);
		//String childwindowid = al.get(1);
		//we need to change selenium focus from main page to child window
		driver.switchTo().window(al.get(1));
		CommonMethods.implicitwait(driver,10000);
		
		String expectedText = "Priyanka Dilip Jadhav";
		String actualText = driver.findElement(By.xpath("//div[text()='Priyanka Dilip Jadhav']")).getText();
		System.out.println("actualText is= "+actualText);
		if(expectedText.equals(actualText))
		{
		System.out.println("Test Case Pass");
		}
		else
		{
		System.out.println("Test Case Fail");
		}
			
		Thread.sleep(1000);
		driver.quit();
	}

}
