package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverTitle_CurrentURL  {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		String title=driver.getTitle();//Take the title of your browser
		System.out.println("Title of the browser:"+title);
		
		//Current URL
		String currenturl=driver.getCurrentUrl();//Used to take the current url of your browser
		System.out.println("URL of te browser is:"+currenturl);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
