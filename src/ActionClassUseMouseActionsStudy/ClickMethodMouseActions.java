package ActionClassUseMouseActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethodMouseActions {

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
		//1. create an object of Actions class and pass driver object
		Actions act= new Actions(driver);
		
		//2. by suing actions class object, we can click
		WebElement seleniumButton =driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[1]"));
		
		//how to click using Actions class
		//seleniumButton.click();--> by using webElement method
		Thread.sleep(1000);
		//use click(webelement Target)
		act.click(seleniumButton).perform();
	}

}
