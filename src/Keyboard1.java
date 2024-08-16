import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");
		
		WebElement src=driver.findElement(By.name("birthday_day"));
		
		Actions action= new Actions(driver);
		
		action.click(src).perform();
		
		Thread.sleep(2000);
		
		for(int i=1;i<=3;i++)
		{
			action.sendKeys(Keys.ARROW_UP).perform();
		}
		action.sendKeys(Keys.ENTER).perform();
		

	}

}
