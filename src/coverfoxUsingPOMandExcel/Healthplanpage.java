package coverfoxUsingPOMandExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Healthplanpage {
	//creating global variable
	@FindBy(xpath="//div[text()=' Next ']") private WebElement nextbutton;
	
	//Constructor
	Healthplanpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public void clickonnextbutton()
	{
		nextbutton.click();
	}

}
