import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParabankTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		Thread.sleep(3000);
		
		Clickonregisterlink clickonregister= new Clickonregisterlink(driver);
		clickonregister.clickonregisterlink();
		
		Thread.sleep(3000);
		
		ParabankRegisterpage parabankRegisterpage = new ParabankRegisterpage(driver);
		parabankRegisterpage.enterfirstname();
		parabankRegisterpage.enterlastname();
		parabankRegisterpage.enteraddress();
		parabankRegisterpage.entercity();
		parabankRegisterpage.enterstate();
		parabankRegisterpage.enterzipcode();
		parabankRegisterpage.enterssn();
		parabankRegisterpage.enterusername();
		parabankRegisterpage.enterpassword();
		parabankRegisterpage.enterpasswordagain();
		parabankRegisterpage.clickonregisterbutton();
		
		Thread.sleep(3000);
		Parabankresult result= new Parabankresult(driver);
		result.printmytext();
	}

}
