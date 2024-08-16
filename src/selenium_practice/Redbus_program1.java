package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Redbus_program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("disable-notifications");
		Thread.sleep(2000);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		String mytext=driver.findElement(By.xpath("//h1[contains(text(),'Online Bus')]")).getText();
		System.out.println(mytext);
		//From
		WebElement src=driver.findElement(By.cssSelector("input#src"));
		src.sendKeys("pune");
		Actions actions=new Actions(driver);
		//actions.click(src).perform();
		Thread.sleep(3000);
		for(int i=1;i<=2;i++)
		{
			actions.sendKeys(Keys.ARROW_UP).perform();
		}
		actions.sendKeys(Keys.ENTER).perform();
		//Destination
		WebElement destination=driver.findElement(By.xpath("//input[@id='dest']"));
		destination.sendKeys("Ahmedabad");
		Actions actions1= new Actions(driver);
		actions1.click(destination).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
//		
//		//Date
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//driver.findElement(By.xpath("//div[@class='sc-kAzzGY jiFglw']")).sendKeys("21 JUL");
		 driver.findElement(By.className("dateText")).click();
		 driver.findElement(By.className("yearText")).click();
//		
//		
//		
//		//Search button
		driver.findElement(By.id("search_button")).click();
	}

}
