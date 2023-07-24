package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOut 
{//If test class contains multiple test method ,if one TC is time consuming to execute,
//then TestNG btdefault Fail the TC and exicute other TC
		
  @Test
  public void TC1()
  {
	  Reporter.log("TC1 is running", true);
  }
  @Test(timeOut = 2000)
  public void TC2() throws InterruptedException
  {
	  Reporter.log("TC2 is running", true);
	  Thread.sleep(3000);
  }
  @Test
  public void TC3()
  {
	  Reporter.log("TC3 is running", true);
  }
}
