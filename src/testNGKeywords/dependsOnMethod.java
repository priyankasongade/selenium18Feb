package testNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod {
  @Test(dependsOnMethods ="enterpassword")
  public void alogin() 
  {
	  Reporter.log("login Succwessfully", true);
  }
  @Test
  public void enterpassword()
  {	 
	  Assert.fail();
	  Reporter.log("enter password", true);
  }
  //1.enterpassword method is fail--->use Assert.fail
  //--->alogin method is skiped
}
