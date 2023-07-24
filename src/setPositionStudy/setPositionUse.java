package setPositionStudy;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPositionUse 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Let me check default Position of webpage
		System.out.println(driver.manage().window().getPosition());//(0,56)
		Thread.sleep(1000);
		
		//create object of point Class and pass parameter(x,y)
		Point p=new Point(150, 200);
		
		//by using setOption Method we can set browser position
		driver.manage().window().setPosition(p);	

	}

}
