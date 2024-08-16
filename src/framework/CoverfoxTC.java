package framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CoverfoxTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		CoverfoxFirstpage firstpage= new CoverfoxFirstpage(driver);
		firstpage.clickOnGenderbutton();
		
		Coverfoxhealthplan healthplan = new Coverfoxhealthplan(driver);
		healthplan.clickonnextbutton();
		
		Coverfoxmemberdetails memberdetail = new Coverfoxmemberdetails(driver);
		memberdetail.selectage();
		memberdetail.clickbutton();
		
		Coverfoxaddressdetails addressdetail = new Coverfoxaddressdetails(driver);
		addressdetail.takemobilenumber();
		addressdetail.takepincode();
		addressdetail.clickonbutton();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		Thread.sleep(4000);
		Coverfoxresultpage result= new Coverfoxresultpage(driver);
		result.validatebannner();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
	}

}
