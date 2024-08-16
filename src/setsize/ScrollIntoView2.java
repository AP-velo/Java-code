package setsize;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement inputfield=driver.findElement(By.id("opentab"));
//		
		JavascriptExecutor js= (JavascriptExecutor)driver;
	
		js.executeScript("arguments[0].click();",inputfield);
		
		
		WebElement inputfield1=driver.findElement(By.name("enter-name"));
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
		 js1.executeScript("arguments[0].scrollIntoView(true)",inputfield1);
		 inputfield1.sendKeys("Abhijeet");
		 Thread.sleep(2000);
		 driver.quit();
	}

}
