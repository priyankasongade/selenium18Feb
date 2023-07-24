package FBAccountDataProviderAnnotetionUse;

import org.testng.annotations.DataProvider;

public class DataProviderTest 
{
	//1st create simple java class
	//no need main method here
	//1 TC exicute for multipleUser use @data provider annotation at class level
	//multple Users that's Why use MultiDimentional Array
	//all test data in string that's why use return Type String
	@DataProvider(name="myFBdata")
	public static String[][] testData()
	{
	String data[][]={{"Vicky","Jadhav","8237549296"},{"Priyanka","Songade","9130409613"},{"Priya","jadhav","9309053644"}};
	return data;
	}

	@DataProvider(name="rediff")
	public static String[][] testDatarediff()
	{
	String data[][]={{"Mahesh","Sir","98989898"},{"Pramod","Patil","8888888888"},{"pqr","lmn","1234"}};
	return data;
	}
}
