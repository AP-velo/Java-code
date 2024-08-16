package webelemet_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected_study {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement radiobutton=driver.findElement(By.cssSelector("input[value='radio2']"));
		radiobutton.click();
		//to check whether the button is selected or not
		if(radiobutton.isSelected())//It is used to check whether your element is selected or not.It is off boolean type in nature.
			System.out.println("The button is selected");
		else
		{
			radiobutton.click();
			System.out.println("Now the button got selected");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
