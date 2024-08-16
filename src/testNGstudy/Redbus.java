package testNGstudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
  @Test
  public void f() {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redbus.in/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  driver.close();
  }
}
