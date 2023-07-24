package IFrameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(20000);
		//switch to main frame to frame1
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("topic")).sendKeys("velocity");
		
		
		
	}
	

}
