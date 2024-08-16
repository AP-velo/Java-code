import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("");
		
		WebElement hidebutton =driver.findElement(By.id(""));
		WebElement showbutton=driver.findElement(By.id(""));
		hidebutton.click();
		//showbutton.click();
		WebElement hiddenbox=driver.findElement(By.xpath(""));
		if(hiddenbox.isDisplayed())
			hiddenbox.sendKeys("Abhijeet");
		else
		{
			showbutton.click();
			hiddenbox.sendKeys("Velocity");
		}

	}

}
