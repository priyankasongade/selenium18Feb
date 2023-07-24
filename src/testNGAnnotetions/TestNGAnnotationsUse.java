package testNGAnnotetions;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsUse 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Open Browser Successfully", true);		
	}
	@BeforeMethod
	public void loginToFlipcart()
	{
	 Reporter.log("Login Flipcart Application", true);		
	}
	@Test
    public void addToCartFunctionality()
    {
	  Reporter.log("Add To Cart Functionality", true);		  
    }
    @AfterMethod
    public void logoutToFlipcart()
    {
	  Reporter.log("Logout Flipcart Application", true);
    }
    @Test
    public void romoveProductFromCart()
    {
	  Reporter.log("romoveProductFromCart", true);  
	}
    @AfterClass
    public void closeBrower()
    {
		Reporter.log("Close Browser Successfully", true);		
    }
  
}
