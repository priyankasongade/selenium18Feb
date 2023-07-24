package chromeOptionsClassStudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsMultipleOptionsUseInOneBrowser {

	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
		ArrayList<String>al=new ArrayList<>();
		al.add("incognito");
		al.add("strat-maximized");
		al.add("disable-notificatios");
		opt.addArguments(al);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		

	}

}
