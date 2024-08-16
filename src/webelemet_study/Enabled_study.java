package webelemet_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		WebElement mobileno=driver.findElement(By.id("mobileNumber"));
		mobileno.sendKeys("9428318014");
		WebElement getotp=driver.findElement(By.xpath("//button[text()='Get OTP']"));
		 Thread.sleep(2000);
		 boolean result=getotp.isEnabled();
		 System.out.println(result);

	}

}
