package ActionClassUseKeyBoardActionsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsStudy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement day = driver.findElement(By.id("day"));
		
		// create an object of Actions class
		Actions act= new Actions(driver);
		Thread.sleep(1000);
		
		//keys.HOME Use=Go to initial position 
		//keys.Enter Use=Go to last Position
		  //act.sendKeys(day, Keys.HOME, Keys.ENTER).perform();
		
		//we want to write perticular date in list
		// to open list options of day
		act.click(day).perform();
		//use for loop
		for(int i=1;i<=5;i++)//5 time date down janar aani enter keyavr ti date day madhe disnar
		{
			Thread.sleep(100);
			act.sendKeys(day, Keys.ARROW_DOWN).perform();//Arrow Down use==>when we select date 
			//then bydefault date contains todys Date ,if we select up abd down date using keyboard Actions
			//then use Keys.ARROW_UP or Keys.ARROW_DOWN then click enter
		}
			act.sendKeys(day, Keys.ENTER).perform();	
	}

}
