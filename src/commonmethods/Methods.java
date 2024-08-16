package commonmethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//WebElement myelement=driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));//scrollintoview
		Thread.sleep(2000);
		//CommonMethods.scrollIntoView(driver,myelement);
		//CommonMethods.takescreenshot(driver, "test1");//takescreenshot
		String myfile="C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx";
		Utility.takethedatafromexcel(myfile, "Sheet1", 1, 0);
	}

}
