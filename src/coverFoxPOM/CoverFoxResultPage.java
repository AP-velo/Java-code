package coverFoxPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {
	@FindBy(xpath = "//div[contains(text(),'Insurance Plans')]")
	private WebElement resultText;
	
	@FindBy(className = "plan-card-container")
	private List<WebElement> banners;
	
	@FindBy(className = "//div[@class='title']")
	private WebElement sortPlanFilter;
	
	
	public CoverFoxResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validateBanners()
	{
		String value=resultText.getText();
		String[] s1=value.split(" ");
		int v1=Integer.parseInt(s1[0]);
		if(v1==banners.size())
		{
			System.out.println("They are equal");
		}
		else
			System.out.println("They are not equal");
	}
	
	public int getPlanNumersFromString()
	{
		String[] value1=resultText.getText().split(" ");
		int result=Integer.parseInt(value1[0]);
		return result;
	}
	
	public int getPlanNumersFromBanners()
	{
		int bannerSize=banners.size();
		return bannerSize;
	}
	
	public boolean sortPlanFilterIsDisplayed()
	{
		boolean result=sortPlanFilter.isDisplayed();
		return result;
	}
	
	
}
