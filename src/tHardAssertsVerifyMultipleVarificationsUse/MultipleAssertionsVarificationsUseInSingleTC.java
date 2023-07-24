package tHardAssertsVerifyMultipleVarificationsUse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleAssertionsVarificationsUseInSingleTC
{
	//HardAssert==>1TC contains Multiple varifications,if 1 varification fail then 
	//remaining varifications will not be varified and TextNG will not exicute the next varifications.
	//and textNG exicute next TC
	//midiater can not use in hard assert
  @Test(priority = -1)
  public void UsernamePage()
  {
	   String actualUN=null;
	   String expectedUN = "abc";
	   
	   Assert.assertNotNull(actualUN, "value is null then TC is faild");//TC fail actualUN=null
	   //testng not check 2nd varification atuomatically he exicute 2nd TC
	   //overComes those issue that's why use Soft assert for varification
	   Assert.assertEquals(actualUN,expectedUN,"actual and expected Notmatching then TC fail");
  }
  @Test
  public void PasswordPage()
  {
	  String actualPass="123";
	   String expectedPass = "123";
	   
	   Assert.assertNotNull(actualPass, "value is null then TC is faild");
	   Assert.assertEquals(actualPass,expectedPass,"actual and expected Notmatching then TC fail");
  }
}
