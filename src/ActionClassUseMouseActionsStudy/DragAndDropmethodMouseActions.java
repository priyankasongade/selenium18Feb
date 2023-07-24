package ActionClassUseMouseActionsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropmethodMouseActions {


	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement amountValue = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement amountField = driver.findElement(By.id("amt8"));
		
		// scroll into view at amount field
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",amountField);
		Thread.sleep(1000);
		
		//to use drag and drop we need to create object of Actions class
		Actions act= new Actions(driver);
		
	// drag and drop using inbuilt method
		act.dragAndDrop(amountValue, amountField).perform();
	// drag and drop using old ways
		//act.clickAndHold(amountValue).moveToElement(amountField).release().build().perform();
	}

}
