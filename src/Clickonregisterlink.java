import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickonregisterlink {
	
	@FindBy(xpath = "//a[text()='Register']") private WebElement registerlink;
	
	Clickonregisterlink(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonregisterlink()
	{
		registerlink.click();
	}

}
