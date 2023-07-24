package testNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywordsUseINSingleClass {
  @Test
  public void a() 
  {//a is fail
	  Assert.fail();
	  Reporter.log("a is running", true);
  }
  @Test(priority=10)
  public void b()
  {
	  Reporter.log("b is running", true);
  }
  @Test(dependsOnMethods = {"a","b"},priority = 9)
  public void c()
  {
	  
	  Reporter.log("c is running", true);
  }
}
//a-->fail
//b-->exicuted
//c-->skips
