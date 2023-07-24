package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount //sometimes some test methods/tc need to run multiple time 
//that time invocation count keyword is used
{
  @Test(invocationCount = 3)//this test method/tc run 3 time
  public void busbooking () 
  {
	  Reporter.log("bus booking in running", true);
  }
  @Test
  public void phonebooking()
  {
	  Reporter.log("phone booking in running", true);
 
  }
}
