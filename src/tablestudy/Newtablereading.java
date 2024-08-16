package tablestudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtablereading {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=ind+vs+eng&rlz=1C1UEAD_enIN1071IN1071&oq=ind+vs&gs_lcrp=EgZjaHJvbWUqEggBEAAYQxiDARixAxiABBiKBTIPCAAQRRg5GIMBGLEDGIAEMhIIARAAGEMYgwEYsQMYgAQYigUyEggCEAAYQxiDARixAxiABBiKBTISCAMQABhDGIMBGLEDGIAEGIoFMhAIBBAAGIMBGLEDGIAEGIoFMgYIBRAAGAMyDwgGEAAYQxixAxiABBiKBTIQCAcQABiDARixAxiABBiKBTIGCAgQABgDMhAICRAAGIMBGLEDGIAEGIoF0gEINDE3M2owajeoAgCwAgA&sourceid=chrome&ie=UTF-8#cobssid=s&sie=m;/g/11vpfvpzgh;5;/m/026y268;cms;fp;1;;;");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		int totalnoofcolumn=driver.findElements(By.xpath("(//table[@class='imspo_tps__tb'])[1]//tr[1]//th")).size();
		System.out.println(totalnoofcolumn);
		
		int totalnoofrows=driver.findElements(By.xpath("(//table[@class='imspo_tps__tb'])[1]//tr")).size();
		System.out.println(totalnoofrows);
		
		for(int i=2;i<=7;i++)
		{
			String mytext=driver.findElement(By.xpath("(//table[@class='imspo_tps__tb'])[1]//tbody[2]//tr[@class='imspo_tps__row-bord imspo_tps__psrow']//td["+i+"]")).getText();
			System.out.print(mytext);
		}
	}

}
