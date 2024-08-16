package coverfoxUsingPOMandExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Memberdetailspage {
	//creating global variable[// WebElements--> data members]
	@FindBy(name="You") private WebElement agedropdown;
	@FindBy(className="next-btn") private WebElement nextbutton;
	
	//Constructor
	Memberdetailspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void handleAgeDropDown(String age)
	{
		Select s=new Select(agedropdown);
		s.selectByValue(age+"y");
	}
	
	public void clickonnxtbutton()
	{
		nextbutton.click();
	}

}
