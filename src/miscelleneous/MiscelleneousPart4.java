package miscelleneous;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscelleneousPart4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("munj");
		Thread.sleep(1000);
		List<WebElement> results=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(results.size());//10
		
	for(WebElement w:results)
		{
			System.out.println(w.getText());	
		}
		
		Thread.sleep(100);
		String required="munjya cast";
		for(WebElement w1:results)
		{
			String actual=w1.getText();
			Thread.sleep(1000);
			if(actual.equals(required))
			{
				w1.click();
				break;
			}
		}
//		ListIterator<WebElement> lit= results.listIterator();
//		while(lit.hasNext())
//		{
//			System.out.println(lit.next());
//		}
	}

}
