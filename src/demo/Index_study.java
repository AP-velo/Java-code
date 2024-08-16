package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Index_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stube
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.scaler.com/");
		driver.findElement(By.xpath("//input[@type='radio'][2]"));
		driver.findElement(By.xpath("//input[@name='program'][2]"));

	}

}
