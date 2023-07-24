package tooltipsHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipsStudy {

	public static void main(String[] args)
	{
	        WebDriver driver = new ChromeDriver();	
	        driver.manage().window().maximize();
	        driver.get("https://demo.guru99.com/test/social-icon.html");
	        
	        String expectedtooltip = "Mail";
	        
	        // Find the mail icon at the top right of the header	
	        WebElement mailtooltip = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
	        System.out.println(mailtooltip.getText());
	        
	       // System.out.println(mailtooltip.getAttribute("title"));
	        
	        //i need to retrive tootip
	        //tootip retrive "title"attribute value
	        //to retrive the attribute value using[getattribute(attribute value)]		
	        String actualtooltip = mailtooltip.getAttribute("title");
	        
	        //compaire expectedtootip text and actualtooltip text        
	        System.out.println("Actual Title of Tool Tip ="+actualtooltip);							
	        if(actualtooltip.equals(expectedtooltip)) 
	        {							
	            System.out.println("Test match");					
	        }		
	        driver.close(); 
	        
	        
	}

}
