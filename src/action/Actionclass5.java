package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass5 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		
		//Write a webelement of the element and store it in a variable
		WebElement scrollup=driver.findElement(By.xpath("//h1[contains(text(),'Recharge')]"));
		
		//Action
		Actions action= new Actions(driver);
		
		//Scroll to the element you want
		action.scrollToElement(scrollup).perform();

	}

}
