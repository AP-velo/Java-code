package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Different_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		//id locator
		driver.findElement(By.id("mobileNumber")).sendKeys("9428318014");
		//name locator
		driver.findElement(By.name("mobileNumber"));
		//

	}

}
