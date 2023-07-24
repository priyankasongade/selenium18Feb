package scrollingStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollingIntoViewStudy {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.justdial.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement PopulatText = driver.findElement(By.xpath("//h2[text()='Popular Categories']"));
		//driver object typecast
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",PopulatText);
	}

}

