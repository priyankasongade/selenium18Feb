package FBAccountDataProviderAnnotetionUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateFBAccountTestNGClass 
{
	@Test(dataProvider = "myFBdata",dataProviderClass = DataProviderTest.class)
	public void FBAccount(String firstname,String lastname,String MobileNO) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys(MobileNO);
		Thread.sleep(1000);

		
		
	}
	
		
}
