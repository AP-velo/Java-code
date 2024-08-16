package framework.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxFirstpage {

		// TODO Auto-generated method stub
		//WebElement ->Data members
		@FindBy(xpath="//div[text()='Male']")private WebElement menbutton;
		
		//Cunstructor
		CoverfoxFirstpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Methods
		public void clickOnGenderbutton()
		{
			menbutton.click();
		}

	

}
