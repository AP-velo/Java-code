import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablepart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		List<WebElement> myelement=driver.findElements(By.xpath("//table[@class='tg']//tr"));
		System.out.println(myelement.size());
		
		List<WebElement> columnno=driver.findElements(By.xpath("//table[@class='tg']//tr[1]//th"));
		System.out.println(columnno.size());
		
		for(int i=1;i<=6;i++)
		{
			WebElement mytext=driver.findElement(By.xpath("//table[@class='tg']//tr[2]//td["+i+"]"));
			System.out.println(mytext.getText());
		}
		
		//Particular column reading
		
		for(int i=2;i<=7;i++)
		{
			WebElement mytext1=driver.findElement(By.xpath("//table[@class='tg']//tr["+i+"]//td[2]"));
			System.out.println(mytext1.getText());
		}

	}

}
