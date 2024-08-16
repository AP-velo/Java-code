import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/auth");
		
		driver.findElement(By.xpath("//h1[contains(text(),'Ready')]")).getText();
		driver.findElement(By.xpath("(//span[@class='css-1mr6abr e1wnkr790'])[1]")).click();
		
		String windowhandle=driver.getWindowHandle();
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandle);
		System.out.println(windowhandles);
		
		ArrayList<String> ar= new ArrayList(windowhandles);
		String mainpage=ar.get(0);//mainpage
		String childpage=ar.get(1);//childpage
		
		driver.switchTo().window(childpage);
		driver.findElement(By.id("identifierId")).sendKeys("abcd@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).getText();


	}

}
