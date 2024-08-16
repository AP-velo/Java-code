package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Coverfoxmemberdetails {
	
	//WebElement- Data members
	@FindBy(id = "Age-You") private WebElement agedropdown;
	@FindBy(className = "next-btn") private WebElement nextbutton;
	
	//Constructor
	Coverfoxmemberdetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void selectage()
	{
		Select s= new Select(agedropdown);
		s.selectByValue("24y");
	}
	
	public void clickbutton()
	{
		nextbutton.click();
	}

	public void selectage(Object read_datafromexcel) {
		// TODO Auto-generated method stub
		
	}

}
