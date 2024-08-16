package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_study2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select s= new Select(day);
		s.selectByValue("5");
		
		WebElement month= driver.findElement(By.id("month"));
		Select s1= new Select(month);
		s1.selectByVisibleText("Apr");
		
		WebElement year= driver.findElement(By.cssSelector("select[id='year']"));
		Select s2= new Select(year);
		s2.selectByIndex(20);//It is not used when we have lots of numbers
		
		s.deselectByValue("5");

	}

}
