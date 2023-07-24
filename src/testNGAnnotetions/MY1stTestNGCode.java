package testNGAnnotetions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MY1stTestNGCode {
  @Test
  public void demo() 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.policybazaar.com/");
  }
  @Test
  public void demo1()
  {
	  Reporter.log("demo 1 exicuted", true);
  }
  
}
