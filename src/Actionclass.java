import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//make a object of action class
		Actions action= new Actions(driver);
		
		action.clickAndHold(src).moveToElement(dest).release().build().perform();
		
//		ArrayList<String> ar= new ArrayList<String>();
//		String childpage=ar.get(1);
//		String mainpage=ar.get(0);
//		
//		driver.switchTo().window(childpage);
//		driver.findElement(By.xpath("//span[text()='Accept All']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().window(mainpage);
//		Thread.sleep(2000);
		
//		WebElement src1=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
//		WebElement dest1=driver.findElement(By.xpath("(//li[contains(@class,'placeholder')])[2]"));
//		
//		action.clickAndHold(src1).moveToElement(dest1).release().build().perform();

	}

}
