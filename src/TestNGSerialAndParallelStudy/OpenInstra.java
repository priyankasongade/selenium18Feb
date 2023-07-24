package TestNGSerialAndParallelStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenInstra {
  @Test
  public void INstra() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.instagram.com/");
  }
}
