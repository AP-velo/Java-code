package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();//It is used to open the browser
		//By -> class(Which contains Only static methods)
		driver.get("https://www.facebook.com/signup");//It is used to take us to the site which we mention in the get()
		/*driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abhijeet");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9904166299");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Abhijeet@01");*/
		
		//WebDriver methods
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		driver.quit();
		Thread.sleep(1000);
		
		//XPATH with text value
		//driver.findElement(By.xpath("//div[text()='Create a new account']"));
		//driver.findElement(By.xpath("//div[text()='It's quick and easy.']"));
		//driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']"));
		//driver.findElement(By.xpath("(//input[@name='radioButton'])[3]"));
		//XPATH FOR LONG TEXT
		
		//driver.findElement(By.xpath("//input[contains(@name,'first')]"));
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]"));
	}
}
