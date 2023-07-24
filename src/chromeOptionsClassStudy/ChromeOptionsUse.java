package chromeOptionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUse {

	public static void main(String[] args) 
	{
		//browse not lanch
		//create a object of chromeOptions Class
		ChromeOptions opt=new ChromeOptions();
		//using ChromeOption Object Select Desired Options
		//opt.addArguments("headless");//Browser/UI not visible and only focus on work
		opt.addArguments("incognito");//open browser in incognito made(private browser)
		//opt.addArguments("start-maximized");//open browser in maximized
		//opt.addArguments("disable-infobars");
		//pass the object as a parameter in chromedriver
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.com/");
		WebElement gmailtext = driver.findElement(By.xpath("//a[text()='Gmail']"));
		System.out.println("text is "+gmailtext.getText());
		
	}

}
