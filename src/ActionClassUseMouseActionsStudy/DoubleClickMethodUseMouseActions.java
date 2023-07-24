package ActionClassUseMouseActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethodUseMouseActions {

	public static void main(String[] args) throws InterruptedException 
	{

		//The various mouse actions that are provided by the Actions class are-
	    //1. click () – clicks at the current location
	    //2. doubleClick() – performs a Double click at the current mouse location
	    //3. contextClick() – performs a Right click at the current mouse location
	    //4. dragAndDrop(WebElement source, WebElement target) – drags an element from the source location and drops in target location
	    //5. moveToElement(WebElement target) – moves to the target element

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Steps to take actions using Actions class(Mouse actions)
		//create an object of Actions class and pass driver object
		Actions act= new Actions(driver);
		
		//by suing actions class object, we can Doubleclick
		WebElement doubleClickButton =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//how to Doubleclick using Actions class in multiple way
		Thread.sleep(1000);
	//1.doubleClick(webelement targate)
		//act.doubleClick(doubleClickButton).perform();
		
	//2.use moveToElement And use doubleClickButton and use doubleClick Action 
		//act.moveToElement(doubleClickButton).perform();
		//act.doubleClick().perform();
		
	//3.use moveTo Element,Use Variable doubleClickButton,and use doubleClick Action and use build	
		//perform=>action on one perticular element then use perform()
		//build=>1 element cotains multiple Actions then use build()
		act.moveToElement(doubleClickButton).doubleClick().build().perform();
		
		
		
		
		
	}

}
