package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actionclass6 {

	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions option= new ChromeOptions();
		//option.addArguments("disable-notification");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		//
		 WebElement  src = driver.findElement(By.id("src"));
		 src.sendKeys("pu");
		 
		 Actions action= new Actions(driver);
		 
		 for(int i=1;i<=3;i++)
		 {
			 Thread.sleep(1000);
			 action.sendKeys(Keys.ARROW_DOWN).perform();
		 }
		 action.sendKeys(Keys.ENTER).perform();
		 
		 WebElement dest=driver.findElement(By.id("dest"));
		 dest.sendKeys("va");
		 
		 for(int i=1;i<=3;i++)
		 {
			 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN).perform();
		 }
		 action.sendKeys(Keys.ENTER).perform();
	}

}
