package dataproviderTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainclassDataprovider {
	@Test(dataProvider="Student", dataProviderClass=dataproviderTestNG.DataproviderTest.class)
  public void f(String name,String lname,String mobNo) throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.findElement(By.name("firstname")).sendKeys(name);
	  driver.findElement(By.name("lastname")).sendKeys(lname);
	  driver.findElement(By.name("reg_email__")).sendKeys(mobNo);
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}
