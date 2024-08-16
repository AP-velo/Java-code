package framework;

import org.testng.annotations.Test;

import dataproviderTestNG.Utilitydataprovider;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CoverfoxusingTestNG {
	WebDriver driver;
	CoverfoxFirstpage firstpage;
	Coverfoxhealthplan healthplanpage;
	Coverfoxmemberdetails memberdetailspage;
	Coverfoxaddressdetails addressdetailspage;
	Coverfoxresultpage resultpage;
	String filepath;
  @Test
  public void f() throws InterruptedException {
	  int stringplannumbers= resultpage.getPlanNumbersFromString();
	  int bannerplannumber=resultpage.getPlanNumbersFromBanner();
	  Assert.assertEquals(stringplannumbers,bannerplannumber,"They are not equal,TC failed" );
	  
  }
  
  @Test
  public void f1()
  {
	  
  }
  @BeforeMethod
  public void launchbrowser() throws InterruptedException {
	  ChromeOptions opt= new ChromeOptions();
	  opt.addArguments("--disable-notification");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.coverfox.com/health-insurance/?hp=1");
	  Thread.sleep(3000);
	  firstpage=new CoverfoxFirstpage(driver);
	  healthplanpage=new Coverfoxhealthplan(driver);
	  memberdetailspage=new Coverfoxmemberdetails(driver);
	  addressdetailspage= new Coverfoxaddressdetails(driver);
	  resultpage= new Coverfoxresultpage(driver);
	  filepath="C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\Excel\\Ecel1.xlsx";
  }
  
  @BeforeClass
  public void preconditions() throws InterruptedException
  {
	  firstpage.clickOnGenderbutton();
	  Thread.sleep(3000);
	  healthplanpage.clickonnextbutton();
	  Thread.sleep(3000);
	  //memberdetailspage.selectage(Utilitydataprovider.read_datafromexcel(filepath,"Sheet4",0,0));
	  memberdetailspage.clickbutton();
	  Thread.sleep(3000);
	  addressdetailspage.pincodeerrormssg();
	  addressdetailspage.clickonbutton();
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
