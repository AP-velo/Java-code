package framework.copy;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonmethods.Utility;

public class CoverfoxTC {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		
		String filepath="C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx";
		String age=Utility.takethedatafromexcel(filepath, "Sheet2", 0, 0);
		String pincode=Utility.takethedatafromexcel(filepath, "Sheet2", 0, 1);
		String phonenumber=Utility.takethedatafromexcel(filepath,"Sheet2", 0, 2);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		CoverfoxFirstpage firstpage= new CoverfoxFirstpage(driver);
		firstpage.clickOnGenderbutton();
		
		Coverfoxhealthplan healthplan = new Coverfoxhealthplan(driver);
		healthplan.clickonnextbutton();
		
		Coverfoxmemberdetails memberdetail = new Coverfoxmemberdetails(driver);
		memberdetail.selectage(age);
		memberdetail.clickbutton();
		
		Coverfoxaddressdetails addressdetail = new Coverfoxaddressdetails(driver);
		addressdetail.takemobilenumber(phonenumber);
		addressdetail.takepincode(pincode);
		addressdetail.clickonbutton();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		Thread.sleep(4000);
		Coverfoxresultpage result= new Coverfoxresultpage(driver);
		result.validatebannner();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
	}

}
