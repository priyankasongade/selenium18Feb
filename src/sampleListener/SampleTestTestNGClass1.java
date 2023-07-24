package sampleListener;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(sampleListener.Listener.class)//listener ani testNG class mdhil communication sathi 
//testNG class level la @listenr annotation use and add path
public class SampleTestTestNGClass1
{
  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 is running...", true);
  }
  @Test(timeOut=500)//TC2 is fail
  public void TC2() throws InterruptedException 
  {
	 Thread.sleep(1500);
	 Reporter.log("TC2 is running...", true);
  }
  @Test(dependsOnMethods = "TC2")//TC3 is skip because TC3 depends on TC2 but TC2 id fail 
  public void TC3() 
  {
	  Reporter.log("TC3 is running...", true);
  }
  @Test
  public void TC4() 
  {
	  Reporter.log("TC4 is running...", true);
  } 
}
 