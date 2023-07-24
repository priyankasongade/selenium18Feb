package PolicyBazaarDataProviderAnnotetionUse;

import org.testng.annotations.DataProvider;

public class PolicyBazaarTestData 
{
	@DataProvider(name="PolicyData")
	public static String[][] PBtestData()
	{
		String data[][]= {{"9309053644","priya@jadhav","Priyanka Dilip Jadhav"},{"9623153925","raju@2811","Rajashri Kadam"}};
		return data;
		
	}
	

}
