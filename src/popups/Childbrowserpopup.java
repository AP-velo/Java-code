package popups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/auth");
		String mytext=driver.findElement(By.xpath("//h1[contains(text(),'Ready')]")).getText();
		System.out.println(mytext);
		
		//click on google
		driver.findElement(By.xpath("//span[contains(text(),'Google')]")).click();
		String windowhandle=driver.getWindowHandle();//Give id of main page
		Set<String> windowhandles=driver.getWindowHandles();//give id of the windows which are opening
		System.out.println(windowhandle);
		System.out.println(windowhandles);
		
		ArrayList<String>ar=new ArrayList(windowhandles);
		String mainwindow=ar.get(0);//main page
		String childwindow=ar.get(1);//child page
		
		Iterator<String>it=ar.iterator();
		//String mainwindow=it.next();
		//String childwindow=it.next();
		
		//switch to childwindow
		driver.switchTo().window(childwindow);
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("abhijeet@gmail.com");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).getText());
		driver.close();

	}

}
