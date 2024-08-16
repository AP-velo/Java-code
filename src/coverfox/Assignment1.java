package coverfox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//div[text()='Male']")).click();
		driver.findElement(By.className("next-btn")).click();
		//member-details page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement age=driver.findElement(By.id("Age-You"));
		Select s= new Select(age);
		s.selectByValue("26y");
		driver.findElement(By.className("next-btn")).click();
		
		//address-details page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.className("mp-input-text")).sendKeys("390014");
		driver.findElement(By.xpath("//input[@id='want-expert']")).sendKeys("9428318014");
		driver.findElement(By.className("next-btn")).click();
		Thread.sleep(2000);
		//health-plan page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		String mytext=driver.findElement(By.xpath("//div[contains(text(),'Insurance Plans')]")).getText();
		String[] ar=mytext.split(" ");
		String firststring=ar[0];
		int a=Integer.parseInt(firststring);
		System.out.println(a);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(9000));
		List<WebElement> mycharacter=driver.findElements(By.xpath("//div[@class='plan-card-container']"));
		int result=mycharacter.size();
		System.out.println(result);
		if(a==result)
			System.out.println("We have succeed");
		else
			System.out.println("We have failed");
	}

}
