package testngAssertsVarificationUsingTestNG;


import org.testng.Assert;
import org.testng.annotations.Test;
//Asserts==Asserts are used for the varification purpose in the TestNG Class
//in TestNg Class ,we can not use if else statement for varification/validation
//Thats why in testNG class we use Asserts types
//there are Two types of assertions
//1.Hard Assert->we use static methods
//2.Soft Assert->We use non static methods

//Asserts is a class,it contains static methods
//there are 7 Methods
//1.assertEquals(Actual,Expected)==This is a method,compaire Actual and Expected resuls are Same 
									//Then TC PAss otherWise Fail.
//2.assertNotEquals(Actual,Expected)==This is a method,compaire Actual and Expected resuls are NotSame 
									//Then TC PAss otherWise Fail.
//3.assertTrue()==This Method is used verify conditions are true or false,
									//if condition is true then TC Pass OtherWise Fail.
//4.assertFalse()==This Method is used verify conditions are true or false,
									//if condition is true then TC Fail OtherWise Pass.
//5.assertNull()==This method is use to verify components or text fields empty or null if it is empty 
   									//output is pass otherwise fail.
//6.assertNotNull()==Use to verify components or text fields empty or not, if it is not empty output is pass 
									//otherwise fail.
//7.assertFail()==This method is used to intentionally failed test method.

public class AssertEqualsAndAssertNotEquals {
  @Test
  public void a() 
  {
	 String s="Pune";
	 String s1="Pune";
	 String s3="Mumbai";
	  
	Assert.assertEquals(s, s1,"s and s1 are not matching then Tc is failed");//TC is pass
	//Assert.assertEquals(s3, s1,"s3 and s1 are not matching then Tc is failed");//TC is failed msg displayed
	
	Assert.assertNotEquals(s1,s3,"s1 and s3 are matching then TC is failed");//TC is pass
	//Assert.assertNotEquals(s, s1,"s and s1 are matching then Tc is failed");//TC is Failed msg displayed
  }
}
