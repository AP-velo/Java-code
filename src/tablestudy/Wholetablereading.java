package tablestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wholetablereading {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int totalnoofrows=driver.findElements(By.xpath("//table[@name='courses']//tr")).size();
		int totalnoofcolumn=driver.findElements(By.xpath("//table[@name='courses']//tr[1]//th")).size();
		System.out.println(totalnoofrows);
		System.out.println(totalnoofcolumn);
		
		for(int i=1;i<=totalnoofrows;i++)
		{
			for(int j=1;j<=totalnoofcolumn;j++)
			{
				
				if(i==1)
				{
					String myheaderelement=driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(myheaderelement+" ");
				}
				else
				{
					String myelement=driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(myelement+" ");
				}
				
			}
			System.out.println();
		}

	}

}
