package tSoftAssertVerifyMultipleVarificationUse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MultipleAssertsusingSoftAsserts
{
	//HardAssert Disadvantages==>1TC contains Multiple varifications,if 1 varification fail then 
			//remaining varifications will not be varified and TextNG will not exicute the next varifications.
			//and textNG exicute next TC tht's why use SoftAssert.
			//midiater can use in soft assert
	//we use non Ststic methods
	  @Test(priority = -1)
	  public void UserNamePage()
	  {
	
		 String actualUN=null;//"ABC"
		 String expectedUN = "abc";
		 //create Object of SoftAssert
		 SoftAssert s=new SoftAssert();
			   
		 s.assertNotNull(actualUN, "value is null then TC is faild");//TC Pass actualUN=ABC
			
		 s.assertEquals(actualUN,expectedUN,"actual and expected Notmatching then TC fail");//TC fail
		 s.assertAll();//it is a mediater
	  }
	  @Test
	  public void PasswordPage()
	  {
		  String actualPass="123";
		   String expectedPass = "123";
		   //create Object of SoftAssert
			 SoftAssert s1=new SoftAssert();
				   
		   
		   s1.assertNotNull(actualPass, "value is null then TC is faild");
		   s1.assertEquals(actualPass,expectedPass,"actual and expected Notmatching then TC fail");
		   s1.assertAll();
	  }
  
}
