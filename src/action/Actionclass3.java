package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Radio button click on the element and store it in a refrenced variable
		WebElement radiobutton=driver.findElement(By.cssSelector("input[value='radio1']"));
		
		//Make a object of Action class
		Actions action= new Actions(driver);
		
		//Perform the action
		action.moveToElement(radiobutton).click().build().perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
