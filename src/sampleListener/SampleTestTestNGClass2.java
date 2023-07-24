package sampleListener;import org.testng.Assert;
import org.testng.Reporter;
  //import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

  //@Listeners(sampleListener.Listener.class)=if 50 TestClass ,
     //then we can not Add @Listeners annotetion 50 times that time use XML
public class SampleTestTestNGClass2 
{
  @Test
  public void TC5() 
  {
	  Reporter.log("TC5 is running", true);
	  
  } @Test
  public void TC6() 
  {
	  Assert.fail();
	  Reporter.log("TC6 is running", true);
	  
  }
  @Test(dependsOnMethods = "TC6")
  public void TC7() 
  {
	  Reporter.log("TC7 is running", true);
	  
  }
  @Test
  public void TC8() 
  {
	  Reporter.log("TC8 is running", true);
	  
  }
  
}
