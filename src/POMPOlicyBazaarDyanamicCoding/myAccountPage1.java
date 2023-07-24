package POMPOlicyBazaarDyanamicCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountPage1 
{

	//variable declaration

	@FindBy(xpath = "//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private WebElement userName;

	//constructor
	//constructor name and class name same
	public  myAccountPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//methods
	public void validateUserName(String expUN)//hide user name thats why pass parameter 
	{
		
		String actualUN = userName.getText();
		System.out.println("userName----> "+actualUN);
		
		if(expUN.equals(actualUN))
		{
		System.out.println("Actual and Expected user Names are matching Test Case is Passed");
		}
		else
		{
	
		System.out.println("Actual and Expected user Names are not-matching Test Case is Failed");
	
		}
	}

}
