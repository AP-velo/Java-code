package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Make a object of Actions class
		Actions action= new Actions(driver);
		
		//Then perform the actions
		//action.moveToElement(rightclick).contextClick().build().perform();
		//direct use the method with targetvalue
		action.contextClick(rightclick).perform();
		

	}

}
