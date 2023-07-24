package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		//create object of properties class
		Properties obj=new Properties();
		//create object of fileInputStream
		//use read the data from property file
		FileInputStream objfile=new FileInputStream("/home/ubuntu/eclipse-workspace/selenium18Feb/PBPropertyFile.properties");
		//load property file using load method.use=load file
		obj.load(objfile);
		//using property file object and call getproperty() and pass key
		System.out.println(obj.getProperty("url"));
		//System.out.println(obj.get("mobile"));wrong key takli tr string chi default value o/p la diste
		
		
	}

}
