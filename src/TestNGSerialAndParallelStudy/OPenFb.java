package TestNGSerialAndParallelStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OPenFb {
  @Test
  public void Fb() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
  }
}
