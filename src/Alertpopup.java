import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		//switch focus from main page to popup page
		Alert ar= driver.switchTo().alert();
		System.out.println(ar.getText());
		ar.accept();
		//ar.dismiss();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		Alert alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}

}
