package coverfoxUsingPOMandExcel;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonmethods.Utility;

public class CoverfoxTC {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		String filepath="C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx";
		String age=Utility.takethedatafromexcel(filepath, "Sheet4", 0, 0);
		String pincode=Utility.takethedatafromexcel(filepath, "Sheet4", 0, 1);
		String mobilenumber=Utility.takethedatafromexcel(filepath, "Sheet4", 0, 2);
		
		//Create object of Homepage
		Homepage homepage=new Homepage(driver);
		homepage.clickongetstartedbutton();
		
		//Create object of Healthplanpage
		Healthplanpage health=new Healthplanpage(driver);
		health.clickonnextbutton();
		
		//Create object of Memberdetailpage
		Memberdetailspage member= new Memberdetailspage(driver);
		member.handleAgeDropDown(age);
		member.clickonnxtbutton();
		
		//Create object of Addressdetailspage
		Addressdetailspage address=new Addressdetailspage(driver);
		address.enterPincode(pincode);
		address.entermobilenumber(mobilenumber);
		address.clickoncontinuebutton();
		
		Thread.sleep(4000);
		//Create object of resultpage
		Resultpage result= new Resultpage(driver);
		result.validatebanner();
		
		Thread.sleep(4000);
		driver.close();
	}

}
