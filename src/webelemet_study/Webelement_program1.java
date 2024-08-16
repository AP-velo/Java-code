package webelemet_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("Abhijeet");//It is used to add the the data on the textfields
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d')]")).sendKeys("Pawar");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d')]")).clear();//It is used to clear whatever u have written on textfields
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_4')]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_5')]")).click();
		
		//String mytext=driver.findElement(By.xpath("//div[contains(text(),'new account')]")).getText();
		//System.out.println(mytext);
		
		
		//driver.close();
	}

}
