package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupStudy2 {
  @Test
  public void e() 
  {
	  Reporter.log("e is running", true);
  }
  @Test(groups = "Sanity")
  public void f()
  {
	  Reporter.log("f is running", true);
  }
  @Test(groups = "Sanity")
  public void g()
  {
	  Reporter.log("g is running", true);
  }
  @Test(groups = "Regration")
  public void h()
  {
	  Reporter.log("h is running", true);
  }
}
