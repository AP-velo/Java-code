package framework.copy;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coverfoxresultpage {
	
	//WebElement-> Data members
	@FindBy(xpath="//div[contains(text(),' Insurance Plans')]") private WebElement mytext;//@FindBy=it is annotation
	@FindBy(className ="plan-card-container")private List<WebElement> banner;
	
	//constructor
	Coverfoxresultpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Methods
	public void validatebannner()
	{
		String text=mytext.getText();
		String[] ar=text.split(" ");
		String firststring=ar[0];
		int a=Integer.parseInt(firststring);
		
		if(a==banner.size())
			System.out.println("We have succeeed");
		else
			System.out.println("We have not succeed");
	}
}
