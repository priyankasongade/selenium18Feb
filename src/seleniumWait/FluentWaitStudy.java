package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitStudy {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/mindblown");
		//use fluentWait syntax
		//applicable for single element
		//passing 3 parameters(time,condition,polling Frequncy)
		//syntax
		//create object of fluent wait
		Wait<WebDriver>w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(8000)).pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));//condition check
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	}

}