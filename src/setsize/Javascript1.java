package setsize;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Javascript1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Make object of Javascript
		JavascriptExecutor j= (JavascriptExecutor)driver;
		//j.executeScript("window.scrollBy(90,1500)");
//		Thread.sleep(1000);
//		j.executeScript("window.scrollBy(90,500)");
		Thread.sleep(2000);
		j.executeScript("windowscrollBy(90,-1500)");

	}

}
