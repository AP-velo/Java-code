import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> totalnoofrows=driver.findElements(By.xpath("//table[@name='courses']//tr"));
		System.out.println(totalnoofrows.size());
		
		List<WebElement> columnno=driver.findElements(By.xpath("//table[@name='courses']//th"));
		System.out.println(columnno.size());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		WebElement myrow=driver.findElement(By.xpath("//table[@name='courses']//tr[2]//td[2]"));
		System.out.println(myrow.getText());
		
		for(int i=1;i<=3;i++)
		{
			WebElement mytext=driver.findElement(By.xpath("//table[@name='courses']//tr[2]//td["+i+"]"));
			System.out.println(mytext.getText());
		}
	}

}
