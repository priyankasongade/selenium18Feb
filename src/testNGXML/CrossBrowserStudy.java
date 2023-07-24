package testNGXML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserStudy {
  @Test
  public void MultiBrowser() 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.instagram.com/");
  }
}
