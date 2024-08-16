package tablestudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablepart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Total no of rows
		List<WebElement> tablerows=driver.findElements(By.xpath("//table[@name='courses']//tr"));
		System.out.println(tablerows.size());
		
		//How many columns are there
		List<WebElement> column=driver.findElements(By.xpath("//table[@name='courses']//tr[1]//th"));
		System.out.println(column.size());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		//Particular row
		WebElement particularrow=driver.findElement(By.xpath("//table[@name='courses']//tr[3]//td[2]"));
		System.out.println(particularrow.getText());
		
		//To read whole column
		for(int i=1;i<=3;i++)
		{
				WebElement myelement=driver.findElement(By.xpath("//table[@name='courses']//tr[2]//td["+i+"]"));
				System.out.println(myelement.getText());
		}
		//To read a whole column
		for(int i=1;i<=3;i++)
		{
			WebElement myelement1=driver.findElement(By.xpath("//table[@name='courses']//tr[3]//td["+i+"]"));
			System.out.println(myelement1.getText());
		}
	}

}
