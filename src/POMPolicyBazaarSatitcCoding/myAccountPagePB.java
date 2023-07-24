package POMPolicyBazaarSatitcCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountPagePB 
{

	//variable declaration

	@FindBy(xpath = "//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private WebElement userName;

	//constructor
	//constructor name and class name same
	public  myAccountPagePB(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//methods
	public void validateUserName()
	{
		String expUN="Priyanka Dilip Jadhav";
		String actualUN = userName.getText();
		
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
