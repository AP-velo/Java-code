package coverfoxUsingPOMandExcel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resultpage {
	
	@FindBy(xpath="//div[contains(text(),'Insurance Plans')]") private WebElement mytext;
	@FindBy(className="plan-card-container") private List<WebElement> banner;
	
	Resultpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validatebanner()
	{
		String mydata=mytext.getText();
		String[] s1=mydata.split(" ");
		int value = Integer.parseInt(s1[0]);
		if(value==banner.size())
		{
			System.out.println("They are matching,TC passed");
		}
		else
			System.out.println("They are not matching,TC failed");
	}

	public int getPlanNumbersFromString() {
		String text=mytext.getText();
		String[] s2=text.split(" ");
		int value=Integer.parseInt(s2[0]);
		return value;
	}
	
	public int getbannerNumbersFromString()
	{
		int bannersize=banner.size();
		return bannersize;
	}

}
