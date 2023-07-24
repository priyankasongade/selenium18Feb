package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupStudy1 {
  @Test(groups = "Sanity")
  public void a()
  {
	  Reporter.log("a is running", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("b is running", true);
  }
  @Test(groups = "Regration")
  public void c()
  {
	  Reporter.log("c is running", true);
  }
  @Test(groups = "Sanity")
  public void d()
  {
	  Reporter.log("d is running", true);
  }
}
