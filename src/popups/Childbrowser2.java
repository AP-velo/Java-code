package popups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser2 {

	public static void main(String[] args) throws InterruptedException {
		
		//NoSuchWindowException
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://secure.indeed.com/auth");
		driver.manage().window().maximize();
		String mytext=driver.findElement(By.xpath("//h1[contains(text(),'Ready')]")).getText();
		System.out.println(mytext);
		driver.findElement(By.xpath("//span[contains(text(),' Google')]")).click();
		
		//to get window ids
		String windowhandle=driver.getWindowHandle();//main page window id
		Set<String> windowhandles=driver.getWindowHandles();//child page windowid
		System.out.println(windowhandle);
		System.out.println(windowhandles);
		
		// By using ArrayList 
		ArrayList<String> al= new ArrayList(windowhandles);
		String mainpage=al.get(0);//main page
		String childpage=al.get(1);//child page
		//System.out.println(mainpage);
		//System.out.println(childpage);
		
		//By using Iterator
		
		/*Iterator<String> it= al.iterator();
		String mainpage=it.next();
		String childpage=it.next();
		System.out.println(mainpage);
		System.out.println(childpage);*/
		
		//to change focus of selenium
		driver.switchTo().window(childpage);
		driver.findElement(By.name("identifier")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.close();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).getText());
	}

}
