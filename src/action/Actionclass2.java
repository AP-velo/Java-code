package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//Doubleclick on the element and store it in a refrenced variable
		WebElement doubleclick=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		//Make a object of Action class and pass the object of chrome driver(driver) in it
		Actions action= new Actions(driver);
		
		//Perform the action
		//action.moveToElement(doubleclick).doubleClick().build().perform();
		action.doubleClick(doubleclick).perform();

	}

}
