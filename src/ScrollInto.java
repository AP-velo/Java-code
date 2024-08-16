import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollInto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		
		WebElement src=driver.findElement(By.xpath("(//h1[contains(text(),'Recharge')])[1]"));
		
		Actions action = new Actions(driver);
		
		action.scrollToElement(src).perform();

	}

}
