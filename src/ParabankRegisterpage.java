import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParabankRegisterpage {
	
	//WebElement-> Data Members
	@FindBy(id = "customer.firstName") private WebElement firstname;
	@FindBy(name = "customer.lastName") private WebElement lastname;
	@FindBy(xpath = "(//input[@class='input'])[5]") private WebElement address;
	@FindBy(css = "input[name='customer.address.city']") private WebElement city;
	@FindBy(id = "customer.address.state") private WebElement state;
	@FindBy(name = "customer.address.zipCode") private WebElement zipcode;
	@FindBy(name = "customer.ssn") private WebElement ssn;
	@FindBy(name = "customer.username") private WebElement username;
	@FindBy(id="customer.password") private WebElement password;
	@FindBy(id="repeatedPassword") private WebElement confirmpassword;
	@FindBy(xpath = "//input[@value='Register']") private WebElement registerbutton;
	
	//Constructor
	ParabankRegisterpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void enterfirstname() {
		firstname.sendKeys("Abhijeet");
		
	}
	
	public void enterlastname()
	{
		lastname.sendKeys("Pawar");
	}
	
	public void enteraddress()
	{
		address.sendKeys("C-201 Nand Residency");
	}
	
	public void entercity()
	{
		city.sendKeys("Baroda");
	}
	
	public void enterstate()
	{
		state.sendKeys("Gujrat");
	}
	
	public void enterzipcode()
	{
		zipcode.sendKeys("390014");
	}
	
	public void enterssn()
	{
		ssn.sendKeys("1234");
	}
	
	public void enterusername()
	{
		username.sendKeys("abhijeet1235");
	}
	
	public void enterpassword()
	{
		password.sendKeys("abhijeet@01");
	}
	
	public void enterpasswordagain()
	{
		confirmpassword.sendKeys("abhijeet@01");
	}
	
	public void clickonregisterbutton()
	{
		registerbutton.click();
	}

}
