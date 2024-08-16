package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_study1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.switchTo().frame("courses-iframe");//using id
		//driver.switchTo().frame(1);//using index
		//driver.switchTo().frame("iframe-name");//switch focus of selenium from main page to frame page.Usinf name
		WebElement framepage=driver.findElement(By.xpath("//strong[text()=' Learn Earn & Shine']"));
		String mytext=framepage.getText();
		
		System.out.println(mytext);
		//driver.switchTo().parentFrame();//switch focus of selenium from frame page to the parent page
		driver.switchTo().defaultContent();
		driver.findElement(By.id("checkBoxOption2")).click();
		

	}

}
