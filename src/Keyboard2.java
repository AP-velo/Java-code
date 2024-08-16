import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");
		
		WebElement src=driver.findElement(By.id("month"));
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
		action.click(src).perform();
		
		for(int i=1;i<=3;i++)
		{
			action.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		action.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		WebElement src1= driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		action.click(src1).perform();
		
		for(int i=1;i<=10;i++)
		{
			action.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		action.sendKeys(Keys.ENTER).perform();

	}

}
