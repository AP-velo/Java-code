package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coverfoxhealthplan {
	
	//WebElement-Data members
	@FindBy(className = "next-btn") private WebElement nextbutton;
	
	//Constructor
	Coverfoxhealthplan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public void clickonnextbutton()
	{
		nextbutton.click();
	}

}
