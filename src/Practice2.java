import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String mainpagetext=driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText();
		//System.out.println(mainpagetext);
		
		driver.switchTo().frame("iframe-name");
		
		String text=driver.findElement(By.xpath("//a[contains(text(),'30% OFF on Silver ')]")).getText();
		System.out.println(text);
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		
		
		

	}

}
