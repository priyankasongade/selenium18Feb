package TestNGPOMPolicyBazaarStaticCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountPagePB 
{

	//variable declaration

	@FindBy(xpath = "//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private WebElement userName;
	@FindBy(className="h_l")private WebElement logoutbtn;

	//constructor
	//constructor name and class name same
	public  myAccountPagePB(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//methods
	//he method aashi lihaychi ki mla return actualUN bhetel
	//validate actual UN
	public String getActualUN()
	{
		String ActualUN = userName.getText();
		return ActualUN;	
	}
	public void clickonLogoutButton()
	{
		logoutbtn.click();
	}
}
