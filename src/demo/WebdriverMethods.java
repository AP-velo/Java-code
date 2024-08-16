package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.navigate().to("https://www.google.com/");
		//Click method
		//driver.findElement(By.xpath("//a[@id='opentab']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		//Close and Quit methods
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.close();//It will close the current tab opened by the selenium tool
		//Thread.sleep(1000);
		//driver.quit();//It will close all the tabs which are open by the selenium tool
		//Thread.sleep(1000);
		
		//Maximize and minimize methods
		//driver.manage().window().maximize();//it is mainly used by testers
		//driver.manage().window().minimize();//It is rarely used by the testers
		
		//Navigation methods
		//driver.get("https://vctcpune.com/");
		driver.navigate().to("https://www.google.com/");
		//driver.navigate().back();//It will move towards previous pagw
		//Thread.sleep(1000);
		//driver.navigate().forward();//It will move to the next page
		//Thread.sleep(1000);
		//driver.navigate().refresh();
		//Thread.sleep(1000);
		//driver.close();
		
		

}
}
