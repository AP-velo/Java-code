package tablestudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticulaColumnreading {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		for(int i=2;i<=9;i++)
		{
			String myelement=driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]//td[3]")).getText();
			System.out.println(myelement);
		}

	}

}
