package ScrrenShotUse;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScrrenShotStudy {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Object random = RandomString.make(2);//a-z and 1-9
		
		File destination =new File("//home//ubuntu//Desktop//Priyanka//ScrrenshotStudy//ScrrenshotStudy"+random+".png");
		FileHandler.copy(Src, destination);
	}
	

}
