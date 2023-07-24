package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeostoxSignupAssignment {

	public static void main(String[] args) 
	{
		//account is diactivated 
		//1st signup account
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//insert url
		driver.get("https://www.neostox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//click on signup btn
		driver.findElement(By.xpath("(//a[text()='Sign Up'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9130409613");
		driver.findElement(By.xpath("(//a[text()='Sign Up'])[2]")).click();
		
		//insert password and click on submit btn
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		//handle 1st Hidden Division popup
		//use wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		
		//handle 2nd hidden division popup
		driver.findElement(By.xpath("(//span[text()='×'])[36]")).click();
		
		//for removing frozen window
		driver.navigate().refresh();
		
		//handle 3rd hidden division popup
		driver.findElement(By.xpath("(//span[text()='×'])[36]")).click();
		
		//gettext
		WebElement virtualmoney = driver.findElement(By.xpath("(//span[@class='righttopmenu1'])[2]"));
		System.out.println(virtualmoney.getText());
		
		//select all list and find locater
		virtualmoney.click();
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@aria-labelledby='navbarDropdown']/li)[8]"));
		
		//for traversing
		for(WebElement l:list)
		{
			String expectedResult = "Logout";
			if(expectedResult.equals(l.getText()))
			{
			 l.click();
			 break;
			}
			
		}
		
	}

}
