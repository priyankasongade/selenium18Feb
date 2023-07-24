package popUpUse;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewTab")).click();
		//we want to work on new child window
		//we need to switch selenium focus from main page to child window
		//we switch new window using (get window handles and get window handle)
		//get window handles==use multiple window handles(multilple tab opens)==return type set of String
		//get window handle==use only one window handle(focus on current window)==return type String
		
		Set<String> allwindowId = driver.getWindowHandles();
		//we are converting set object to arraylist
		ArrayList<String>al=new ArrayList<>(allwindowId);
		String MainPageId = al.get(0);
		String ChildPageId = al.get(1);
		//switch selenium focus frome main page to child window
		driver.switchTo().window(ChildPageId);
		Thread.sleep(2000);
		//driver.close();child page close but focus not change	
		String childWindowText = driver.findElement(By.xpath("//h3[contains(text(),'QA tools & automation')]")).getText();		
		System.out.println(childWindowText);
		//again we wan't to focus on main page
		//close child wimdow
		//change focus on main page to child window
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(MainPageId);//focus on main page
		String MainPageText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		System.out.println(MainPageText);
		
	}

}
