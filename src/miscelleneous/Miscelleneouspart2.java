package miscelleneous;

import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleneouspart2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Velo");
		Thread.sleep(2000);
		List<WebElement> result=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println(result.size());
		
//		for(WebElement w:result)
//		{
//			System.out.println(w.getText());
//		}
		
//		ListIterator<WebElement> it=result.listIterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		for(int i=0;i<=result.size()-1;i++)
		{
			System.out.println(result.get(i).getText());
		}
	}

}
