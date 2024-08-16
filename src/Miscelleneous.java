import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("mujya");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		List<WebElement> myelement=driver.findElements(By.xpath("(//ul[contains(@class,'G43f7e')])[1]/li"));
		System.out.println(myelement.size());
		
		for(WebElement w:myelement)
		{
			String title=w.getText();
			System.out.println(title);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		List<WebElement> myelement1=driver.findElements(By.xpath("(//ul[contains(@class,'G43f7e')])[1]/li[3]"));
		String required="munjya ott";
		
		for(WebElement w1:myelement1)
		{
			String actual="munjya ott";
			if(actual.equals(required))
			{
				w1.click();
				break;
			}
		}
		

	}

}
