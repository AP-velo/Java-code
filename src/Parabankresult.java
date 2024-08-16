import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Parabankresult {
	
	@FindBy(xpath = "//p[contains(text(),'created successfully')]") private WebElement mytext;
	
	//Constructor
	Parabankresult(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	
	public void printmytext()
	{
		String printText=mytext.getText();
		System.out.println(printText);
	}
	

}
