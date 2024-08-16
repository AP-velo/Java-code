package miscelleneous;

import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleneousclass1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> src=driver.findElements(By.tagName("a"));
		System.out.println(src.size());
		
		//for(int i=0;i<=src.size()-1;i++)
		//{
		//	System.out.println(src.get(i).getText());
		//}
		
//		Iterator<WebElement> it=src.iterator();
//		while(it.hasnext())
//		{
//			String Text=it.next().getText();
//			System.out.println(Text);
//		}
		
//		for(WebElement w:src)
//		{
//			String Mytext=w.getText();
//			System.out.println(Mytext);
//		}
		
		ListIterator<WebElement> lit= src.listIterator();
		while(lit.hasNext())
		{
			String Text=lit.next().getText();
			System.out.println(Text);
		}
		

	}

}
