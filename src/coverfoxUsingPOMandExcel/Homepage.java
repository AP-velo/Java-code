package coverfoxUsingPOMandExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//creating global variable
	@FindBy(xpath="//button[text()='Get Started']") private WebElement getstartedbutton;
	
	//Constructor
	Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void clickongetstartedbutton()
	{
		getstartedbutton.click();
	}

}
