package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStudy {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/mindblown");
		//use implicitWait syntax
		//applicable for complete webpage
		//passing 1 parameters(time)
		//syntax
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		WebElement signinbtn = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signinbtn.click();
	}

}
