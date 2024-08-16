package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_study {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select s= new Select(dropdown);
		//s.selectByIndex(2);
		//s.selectByValue("option1");
		s.selectByVisibleText("Option3");
		Thread.sleep(2000);
		//driver.close();
	}

}
