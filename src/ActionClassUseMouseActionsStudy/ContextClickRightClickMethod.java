package ActionClassUseMouseActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickRightClickMethod {

	public static void main(String[] args) 
	{
		//The various mouse actions that are provided by the Actions class are-
	    //1. click () – clicks at the current location
	    //2. doubleClick() – performs a Double click at the current mouse location
	    //3. contextClick() – performs a Right click at the current mouse location
	    //4. dragAndDrop(WebElement source, WebElement target) – drags an element from the source location and drops in target location
	    //5. moveToElement(WebElement target) – moves to the target element
		//6.Scroll To Element()--use to scroll that perticular element

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//find locater of that perticular webelement
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Steps to take actions using Actions class(Mouse actions)
		//1. create an object of Actions class and pass driver object
		Actions act= new Actions(driver);
		
		//mutiple way you can use actions
		
	//1.use contextClick(webelement Targate)
		//act.contextClick(rightClick).perform();
		
	//2.use moveToElement And use rightClick variable and use contextClick Action 
		//act.moveToElement(rightClick).perform();
		//act.contextClick().perform();
		
	//3.use moveTo Element,Use Variable rightClick,and use contextClick Action and use build	
		//perform=>action on one perticular element then use perform()
		//build=>1 element cotains multiple Actions then use build()
		act.moveToElement(rightClick).contextClick().build().perform();
				
		
	}

}
