package popups;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		Thread.sleep(2000);
		//Switch selenium focus from main page to alert page
		Alert alt=driver.switchTo().alert();
		alt.accept();//click on "OK" button
		//alt.dismiss();//click on "cancel" button
		System.out.println(alt.getText());//To get the text present on popup page
		Thread.sleep(2000);
		//Switch selenium focus from 1st page of popup towards next page of popup to handle the exception
		Alert alt1=driver.switchTo().alert();
		alt1.accept();
		//String mytext=alt1.getText();
		//System.out.println(mytext);
		//String mytext1=driver.findElement(By.className("barone")).getText();
		//System.out.println(mytext1);
	}

}
