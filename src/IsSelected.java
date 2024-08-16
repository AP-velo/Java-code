import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='radio1']"));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		System.out.println(radiobutton.isSelected());
		
		Thread.sleep(3000);
		driver.close();

	}

}
