package miscelleneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscelleneousPart3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> result=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(result.size());
		Thread.sleep(1000);
		String actual="india national cricket team";
		for(WebElement w:result)
		{
			String expected=w.getText();
			Thread.sleep(1000);
			if(expected.equals(actual))
			{
				w.click();
				break;
			}
		}
		

	}

}
