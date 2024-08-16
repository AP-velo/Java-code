package chromeoptions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeoptionsDisable {

	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		//options.addArguments("disable-notifications");
		//if u want to pass multiple values at once
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("disable-notifications");
		ar.add("start-maximized");
		//ar.add("incognito");
		options.addArguments(ar);
		
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.justdial.com/");
		

	}

}
