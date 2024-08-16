package tablestudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		List<WebElement> totalrows=driver.findElements(By.xpath("//table[@class='tg']//tr"));
		System.out.println(totalrows.size());
		
		List<WebElement> column=driver.findElements(By.xpath("//table[@class='tg']//tr[1]/th"));
		System.out.println(column.size());
		
		for(int i=1;i<=6;i++)
		{
			WebElement myelement=driver.findElement(By.xpath("//table[@class='tg']//tr[2]/td["+i+"]"));
			System.out.println(myelement.getText());
		}

	}

}
