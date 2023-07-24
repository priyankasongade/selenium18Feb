package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority 
{	//byDefault testNG exicution Sequence is alplabetical order
	//to change test method/tc exicution orderthat time use testNG keyword priority
	//priority can be positive,negative,zero or duplicate
	//priority can not be variables or decimals
	//syntax=>priority=2;
	
  @Test(priority=-3)
  public void d() 
  {
	  Reporter.log("d runing",  true);
  }
  @Test(priority=4)
  public void c()
  {
	  Reporter.log("c runing",  true);

  }
  @Test(priority=0)
  public void a()
  {
	  Reporter.log("a runing",  true);

  }
  @Test(priority=-3)//duplicate =get alphabetically
  public void b()
  {
	  Reporter.log("b runing",  true);

  }
  //output=(-3,0,4)b,d,a,c
}
