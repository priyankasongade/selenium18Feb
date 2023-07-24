package chromeOptionsClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDisableNotificationsUse {

	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		
		
	}

}
