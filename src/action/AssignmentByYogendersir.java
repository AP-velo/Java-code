package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AssignmentByYogendersir {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		String user="Pune";
		String s1="";
		for(int i=0;i<=user.length()-2;i++)
		{
			char temp=user.charAt(i);
			s1=s1+temp;
		}
		System.out.println(s1+" ");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		WebElement from=driver.findElement(By.xpath("//input[@role='searchbox'][1]"));
		from.sendKeys(s1);
		
		Actions action=new Actions(driver);
		for(int i=1;i<=2;i++)
		{
			Thread.sleep(1000);
			action.sendKeys(Keys.ARROW_DOWN).perform();
		}
		action.sendKeys(Keys.ENTER).perform();
		
		//Thread.sleep(3000);
//		WebElement dest= driver.findElement(By.xpath("//input[@data-gtm-form-interact-field-id='1']"));
//		dest.sendKeys("pun");
//		
//		for(int i=1;i<=2;i++)
//		{
//			Thread.sleep(1000);
//			action.sendKeys(Keys.ARROW_DOWN).perform();
//		}
//		action.sendKeys(Keys.ENTER).perform();
		

	}

}
