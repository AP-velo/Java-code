package synchronizewait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[contains(@id,'src')]")).sendKeys("Vadodara");
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("Pune");
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(7000));
		w.until(ExpectedConditions.elementToBeClickable(By.id("search_button")));
//		w.until(ExpectedConditions.elementToBeSelected(By.xpath("//button[text()='SEARCH BUSES']")));
		driver.findElement(By.id("search_button")).click();

	}

}
