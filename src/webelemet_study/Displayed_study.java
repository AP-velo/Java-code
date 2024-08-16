package webelemet_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed_study {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement hidebutton=driver.findElement(By.id("hide-textbox"));
		WebElement showbutton=driver.findElement(By.id("show-textbox"));
		hidebutton.click();
		//showbutton.click();
		WebElement hiddentextbox=driver.findElement(By.cssSelector("input[id='displayed-text']"));
		if(hiddentextbox.isDisplayed())//It is used to check whether the element is present or not.It datatype is boolean
			hiddentextbox.sendKeys("Velocity");
		else
		{
			showbutton.click();
			hiddentextbox.sendKeys("Abhijeet");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
