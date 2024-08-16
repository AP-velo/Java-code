package coverfoxUsingPOMandExcel;

import org.testng.annotations.Test;

import commonmethods.Utility;


import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CoverfoxusingTestNG {
	WebDriver driver;
	Homepage homepage;
	Healthplanpage healthplanpage;
	Memberdetailspage memberdetailspage;
	Addressdetailspage addressdetailspage;
	Resultpage resultpage;
	String filepath;
  @Test
  public void f() throws InterruptedException {
	  int stringplannumbers=resultpage.getPlanNumbersFromString();
	  int bannerplannumber=resultpage.getbannerNumbersFromString();
	  Assert.assertEquals(stringplannumbers,bannerplannumber,"They are not equal,TC failed" );
	  
  }
  @BeforeMethod
  public void launchbrowser() throws InterruptedException {
	  ChromeOptions opt= new ChromeOptions();
	  opt.addArguments("--disable-notification");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.coverfox.com/health-insurance/?hp=1");
	  Thread.sleep(3000);
	  homepage=new Homepage(driver);
	  healthplanpage=new Healthplanpage (driver);
	  memberdetailspage=new Memberdetailspage(driver);
	  addressdetailspage= new Addressdetailspage(driver);
	  resultpage= new Resultpage(driver);
	  filepath="C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Excel1.xlsx";
  }
  
  @BeforeClass
  public void preconditions() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  homepage.clickongetstartedbutton();
	  Thread.sleep(3000);
	  healthplanpage.clickonnextbutton();
	  Thread.sleep(3000);
	  memberdetailspage.handleAgeDropDown(Utility.takethedatafromexcel(filepath,"Sheet4",0,0));
	  memberdetailspage.clickonnxtbutton();
	  Thread.sleep(3000);
	  addressdetailspage.entermobilenumber(Utility.takethedatafromexcel(filepath,"Sheet4",0,2));
	  addressdetailspage.enterPincode(Utility.takethedatafromexcel(filepath,"Sheet4",0,1));
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

}
