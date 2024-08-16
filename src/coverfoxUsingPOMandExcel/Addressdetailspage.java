package coverfoxUsingPOMandExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addressdetailspage {
	
	@FindBy(xpath="//input[@type='number']") private WebElement pincodeField;
	@FindBy(xpath="//input[contains(@id,'want-expert')]") private WebElement mobilenumberField;
	@FindBy(xpath="//div[text()='Continue']") private WebElement continuebutton;
	
	//Constructor
	Addressdetailspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void enterPincode(String pincodeValue)
	{
		pincodeField.sendKeys(pincodeValue);
	}
	
	public void entermobilenumber(String mobilenumbervalue)
	{
		mobilenumberField.sendKeys(mobilenumbervalue);
	}
	
	public void clickoncontinuebutton()
	{
		continuebutton.click();
	}

}
