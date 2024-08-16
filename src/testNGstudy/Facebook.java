package testNGstudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
  @Test
  public void f() {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  driver.close();
	  
  }
}
