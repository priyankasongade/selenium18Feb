package testngAssertsVarificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndFalse 
{
  @Test
  public void a()
  {
	  boolean x = true;
	  boolean y = false;
	  
	  Assert.assertTrue(x, "if value is false then TC is failed");//if y then TC Failed msg Displayed
	  Assert.assertFalse(y, "if value is True then TC is Failed");//if x then TC failed msg displayed
  }
}
