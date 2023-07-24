package testngAssertsVarificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFailStudy 
//use to fail TestMethod/TC intentionaly
{
  @Test
  public void a() 
  {
	  Assert.fail();
	  Reporter.log("hii i m priyanka",true);
  }
  @Test
  public void b()
  {
	  Reporter.log("hii i m dipriya",true);
  }
}
