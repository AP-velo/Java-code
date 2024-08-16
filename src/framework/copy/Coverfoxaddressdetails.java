package framework.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coverfoxaddressdetails {
	
	//WebElement- Data members
	@FindBy(className = "mp-input-text") private WebElement pincode;
	@FindBy(css = "input#want-expert") private WebElement mobilenumber;
	@FindBy(className = "next-btn") private WebElement nextbutton;
	
	//Constructor
	Coverfoxaddressdetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void takepincode(String pincode1)
	{
		pincode.sendKeys(pincode1);
	}
	
	public void takemobilenumber(String phonenumber)
	{
		mobilenumber.sendKeys(phonenumber);
	}
	public void clickonbutton()
	{
		nextbutton.click();
	}

}
