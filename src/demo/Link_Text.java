package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement s1=driver.findElement(By.linkText("Open Tab"));//It is used to click on the text which contains link
		s1.click();
		//Thread.sleep(2000);
		//WebElement s2=driver.findElement(By.partialLinkText("Open"));
		//s2.click();
		Thread.sleep(2000);
		driver.close();

	}

}
