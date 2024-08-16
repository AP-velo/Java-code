import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		WebElement myelement=driver.findElement(By.name("dropdown-class-example"));
		myelement.click();
		
		Thread.sleep(2000);
		
		Select s= new Select(myelement);
		s.selectByVisibleText("Option1");
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
