package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		Actions action= new Actions(driver);
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		action.moveToElement(rightclick).contextClick().build().perform();
		Thread.sleep(3000);
		WebElement doubleclick=driver.findElement(By.xpath("//button[contains(text(),'See Alert')]"));
		action.moveToElement(doubleclick).doubleClick().build().perform();
	}

}
