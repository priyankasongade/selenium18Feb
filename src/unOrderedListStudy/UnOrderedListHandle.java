package unOrderedListStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedListHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("honda");
		//list is chenge not constant(unordered)
		//concept of ul and li
		//select whole list
		//find loctor of perticular li(element)
		List<WebElement> searchresults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		//use foreach loop
		for (WebElement sr : searchresults) 
		{
			System.out.println(sr.getText());
			
		}
		
		for (WebElement sr : searchresults)
		{
			String expectedResult = "honda city";
			Thread.sleep(1000);
			if(expectedResult.equals(sr.getText()))
			{
				sr.click();
				break;
			}			
		else
		{
			System.out.println("sorry no element found");
		}
		}
		driver.findElement(By.linkText("Images")).click();
		
		
	
		
		
		
	}

}
