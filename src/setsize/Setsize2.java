package setsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		Point defaultsize=driver.manage().window().getPosition();
		System.out.println(defaultsize);
		
		Point p= new Point(600,75);
		
		driver.manage().window().setPosition(p);
		
		Point p1= new Point(-600,-300);
		driver.manage().window().setPosition(p1);

	}

}
