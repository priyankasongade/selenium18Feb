package sampleListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	//override ITestListener methods
	//method directly yete  fakt ontestsu liha aani ctrl alt daba aapoaap method create hote
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		//result a object
		String name = result.getName();
		Reporter.log("This "+name+" method completed successfully", true);
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("This "+result.getName()+" method is fail plz try again", true);
	}
	@Override
	public void onTestStart(ITestResult result) 
	{
		
		Reporter.log("This "+result.getName()+" exicution started....", true);
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("This "+result.getName()+" TC is skipped.....plz check dependent Method", true);
	}
	

}
