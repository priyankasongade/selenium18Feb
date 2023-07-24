package webTableHandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//by using tagname find locater table header(th)
		List<WebElement> header = driver.findElements(By.tagName("th"));
		
		//find all table header text(th)-->use traversing and iterator
		System.out.println("============================table head====================================================================");
	
	//1.How To Read ->Header Row Only
		Iterator<WebElement> it = header.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next().getText()+" |");
		}
		System.out.println();
	
		System.out.println("==============================table row==================================================================");
		
	//2.How To read single ->table row(tr)
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/td"));
		Iterator<WebElement> it1 = row1.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next().getText()+" |");
		}
		System.out.println();
		
		System.out.println("============================single table data====================================================================");

	//3.How TO read->Single table data(td) from table	
		WebElement rowdata = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td[2]"));
		
		System.out.println(rowdata.getText());
		
		System.out.println("=======================table row use for loop=========================================================================");
	//4.How to read single row data using for loop(i=5 because col=5)
		//perform static coding
		for(int i=1;i<=5;i++)
		{
			WebElement rowdata1 = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td["+i+"]"));
			System.out.print(rowdata1.getText()+" |");
			
		}
		System.out.println();
		
		System.out.println("======================find all rows using nested for loop==========================================================================");

	//5.How to read all rows from table
		//perform static coding
		//we need to vary from 1-26 row and 1-5 col
		//outer for loop -->row(tr)
		for(int i=1;i<=26;i++)
		{
			//inner for loop ------>col(td)
			for(int j=1;j<=5;j++)
			{
				WebElement totalrow = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));
				System.out.print(totalrow.getText()+" |");
			}
			System.out.println();	
			
		}
		System.out.println("======================all table(head+all row)==========================================================================");

	//whole table
		//perform dynamic coding
		//how to find row count in table
		int rowcount = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		
		//how tp find col count in table
		int colcount = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th")).size();		
		
		
		//use nested for loop
		//outerlopp for --->row
		for(int i=1;i<=rowcount-1;i++)
		{
			//inner loop for --->col
			for(int j=1;j<=colcount;j++)
			{
				if(i==1)
				{
					
					WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//th["+j+"]"));
					System.out.print(data.getText()+"  |");
					
				}
				else
				{
					WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
					System.out.print(data.getText()+"  |");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
