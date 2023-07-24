package setSizeStudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Let me check default size of webpage
		System.out.println(driver.manage().window().getSize());//(1366,684)
		Thread.sleep(1000);
		
		//Dimension d = driver.manage().window().getSize();
		
		//create object of dimension class and pass parameter
		//dimension class contains 2 parameter(width and hight)	
		Dimension d1=new Dimension(500,400);
		
		//by using setSize method we can set browser Size
		driver.manage().window().setSize(d1);
		
		driver.get("https://www.naukri.com/");
		
		
		
	}

}
