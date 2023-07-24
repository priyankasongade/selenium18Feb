package IFrameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameUse {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);
		//switching to frame 1
		//we can switch focus 3 way==id or name,index,webelement
		driver.switchTo().frame("frame1");
		//in that frame 1-->gettext()
		String frame1text = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
		System.out.println(frame1text);
		
		Thread.sleep(20000);
		//need to switch frame2
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']")));	
		//in that frame2 find gettext
		String frame2text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(frame2text);
		Thread.sleep(2000);
		
		//we can back to the main page and find header text of main page 
		//when nevigate frame2 to frame1 then use (Driver.switchto.DefaultContent();) 
		//when nevigate frame2 to main page then use (Driver.switchto.parentframe();)
		driver.switchTo().parentFrame();
		String mainpagetext = driver.findElement(By.xpath("//div[text()='Frames']")).getText();
		System.out.println(mainpagetext);
	}

}
