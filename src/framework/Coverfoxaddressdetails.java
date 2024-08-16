package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coverfoxaddressdetails {
	
	//WebElement- Data members
	@FindBy(className = "mp-input-text") private WebElement pincode;
	@FindBy(css = "input#want-expert") private WebElement mobilenumber;
	@FindBy(className = "next-btn") private WebElement nextbutton;
	@FindBy(xpath="//div[contains(text(),' Please enter a valid pincode ')]") private WebElement pincodeerror;
	@FindBy(xpath="//div[contains(text(),'valid mobile no. ')]") private WebElement mobilenoerror;
	//Constructor
	Coverfoxaddressdetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void takepincode()
	{
		pincode.sendKeys("390014");
	}
	
	public void takemobilenumber()
	{
		mobilenumber.sendKeys("9904166299");
	}
	public void clickonbutton()
	{
		nextbutton.click();
	}

	public String pincodeerrormssg()
	{
		String actual=pincodeerror.getText();
		return actual;
	}

}
