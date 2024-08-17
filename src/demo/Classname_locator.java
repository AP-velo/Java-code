package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radiobutton=driver.findElement(By.className("radioButton"));//The classname should have text in a continuos manner there is no gap in the text
		radiobutton.click();
		//line1
		//line2
		//line3

	}

}
