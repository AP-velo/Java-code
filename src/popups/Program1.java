package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/hotels/");
		driver.findElement(By.xpath("//span[@class='landingSprite myIconWhite']")).click();
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();//Goes to cross sign to close this window
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='Hotels'][1])")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
