package scrollingStudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NormalScrollingStudy {

	public static void main(String[] args) throws InterruptedException
	{
		//use chromeoptions
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.justdial.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver object typecast
		JavascriptExecutor js = ((JavascriptExecutor)driver);	
		js.executeScript("window.scrollBy(700,600)");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(100,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(100,-700)");
		
		
	}

}
