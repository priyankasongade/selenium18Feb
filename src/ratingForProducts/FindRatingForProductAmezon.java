package ratingForProducts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindRatingForProductAmezon {

	public static void main(String[] args) throws InterruptedException 
	{
		//ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("incognito");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("laptop");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	WebElement rating = driver.findElement(By.xpath("(//span[contains(text(),'out of 5 stars')])[3]"));
	//Thread.sleep(1000);
		System.out.println(rating.getText());
		
	}

}
