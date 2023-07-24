package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStudy {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/mindblown");
		//use ExplicitWait syntax
		//applicable for single element
		//passing 2 parameters(time,condition)
		
		//1st create object of webdriverwait
		//condition=to element visible hot nahi toprent 
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(8000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
		
		//now find elemwnt
		WebElement signinbtn = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signinbtn.click();
		

	}

}
