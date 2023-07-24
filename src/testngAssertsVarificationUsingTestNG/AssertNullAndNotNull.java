
package testngAssertsVarificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndNotNull {
  @Test
  public void a() 
  {
	  String s = null;
	  String s1 = "abc";
	  
	  Assert.assertNull(s, "if value is notnull the TC failed");//TC pass msg not diplyed
	 // Assert.assertNull(s1, "if value is notNull then TC failed ");//TC failed s1=abc msg displayed
	  
	  Assert.assertNotNull(s1, "if value is null then TC is failed");//TC pass msg not displyed
	  //Assert.assertNotNull(s, "if value is null then TC is failed");//TC failed s=null msg displayed
  }
}
