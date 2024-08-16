package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass4 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Drag and drop the element  and store it in a refrenced variable
		WebElement source=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		// Make a object of Action class
		
		Actions action= new Actions(driver);
		
		//perform the actions
		action.clickAndHold(source).moveToElement(target).release().build().perform();

	}

}
