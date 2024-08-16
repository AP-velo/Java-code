package testNGstudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTmultiplebrowser {
	//Serially Test
	WebDriver driver;
	@Parameters("browser")
	@Test
  public void f(String bname) throws InterruptedException {
	  if(bname.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(bname.equalsIgnoreCase("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.findElement(By.name("firstname")).sendKeys("Abhijeet");
	  driver.findElement(By.name("lastname")).sendKeys("Pawar");
	  driver.findElement(By.name("reg_email__")).sendKeys("9428318014");
	  Thread.sleep(3000);
	  driver.close();
  }
}
