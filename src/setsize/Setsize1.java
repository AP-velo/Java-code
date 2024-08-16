package setsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		Dimension d=driver.manage().window().getSize();
		
		System.out.println(d);//default size
		//creating object of Dimension
//		Dimension d1= new Dimension(500,1500);
//		driver.manage().window().setSize(d1);
		
		Dimension d2=new Dimension(800,300);
		driver.manage().window().setSize(d2);

	}

}
