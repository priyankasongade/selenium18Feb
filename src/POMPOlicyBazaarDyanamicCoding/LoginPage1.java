package POMPOlicyBazaarDyanamicCoding;//commanMethodsUse


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage1
{
	//POM class use thats why no main method use
	
		//only find variables,constructor,methods on one perticular webpage
		//ex.policyBazzar login page
		//1.variables== 1st Url--->signin btn,mobileno.,password,myaccount,myprofile--->2ndUrl change myprofile page open
		//2.constructor==pagefactory.initElement(driver.this)
		//3.methods==use methods--->click,sendkeys.getTest
		
		
	//1.variable(variable declaration)
		//can not create object===not create Driver,not use findelement method
		
		//1.Home Page signin btn
		@FindBy(xpath="//a[text()='Sign in']")private WebElement signInButtonHomePage;;
		//2.Mobile No.
		@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobileNumberFiled;;
		//3.Sign in with password
		@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signInWithPassword;;
		//enter password
		@FindBy(name="password")private WebElement passwordField;;
		//4.signInButton
		@FindBy(xpath="//span[text()='Sign in']")private WebElement signInButton;;
		//5.MyAccount
		@FindBy(xpath="//div[text()='My Account']")private WebElement myAccountButton;;
		//6.MyProfile
		@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProfile;
		
	//2.Constructor
		//use to initilise the variables
		//constructor name same as a class name
		public LoginPage1(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	//3.methods
		//use methods--click,sendkey,gettext
		
		public void Homepagesigninbtn()
		{   
			//1.click()
			signInButtonHomePage.click();
		}
		public void entermobileno(String mobileno) 
		{
			//2.sendkeys
			mobileNumberFiled.sendKeys(mobileno);
		}
		public void SignInWithPassword()
		{
			//3.click
			signInWithPassword.click();
		}
		public void enterPassword(String password)//hiding Data that's why passparameter
		{
			//4.sendkeys
			passwordField.sendKeys(password);	
		}
		public void clicksignInButton()
		{
			//5.click
			signInButton.click();
		}
		public void MyAccount()
		{
			//6.click
			myAccountButton.click();
		}
		public void MyProfile()
		{
			//click
			myProfile.click();	
		}
	
	//No.of webpage=no.of class created
	//2nd url open that's why 2nd class created
	//no main method -how to exicute this things ---create unother class


}
