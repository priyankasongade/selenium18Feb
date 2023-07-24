package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled 

{
  @Test(enabled =false)
  public void d()
  {
	  Reporter.log("d is runnig", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c is runnig", true);

  }
  @Test
  public void b()
  {
	  Reporter.log("b is runnig", true);

  }
  @Test
  public void a()
  {
	  Reporter.log("a is runnig", true);

  }
}
