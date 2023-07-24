package ratingForProducts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatingForProduct {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(7000);
		WebElement rating = driver.findElement(By.xpath("(//div[@class='col col-7-12'])[1]//span[1]/span[1]"));
		System.out.println("rating for product is "+rating.getText());
		
		
	}

}
