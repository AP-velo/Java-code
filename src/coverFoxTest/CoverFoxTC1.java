package coverFoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import coverFoxPOM.CoverFoxAddressDetailsPage;
import coverFoxPOM.CoverFoxHealthPlanPage;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxMemberDetailsPage;
import coverFoxPOM.CoverFoxResultPage;
import coverFoxUtility.Utility;
import coverfoxbase.Baseclass;

public class CoverFoxTC1 extends Baseclass {

	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage healthPlanPage;
	CoverFoxAddressDetailsPage addressDetailsPage;
	CoverFoxMemberDetailsPage memberDetailsPage;
	CoverFoxResultPage resultPage;
	String filepath;
	@BeforeTest
	public void launchBrowser() {
		openbrowser();
		homePage = new CoverFoxHomePage(driver);
		healthPlanPage = new CoverFoxHealthPlanPage(driver);
		addressDetailsPage = new CoverFoxAddressDetailsPage(driver);
		memberDetailsPage = new CoverFoxMemberDetailsPage(driver);
		resultPage = new CoverFoxResultPage(driver);
		filepath = "C:\\Users\\a.pawar\\eclipse-workspace\\Selenium_Study\\src\\Excel2.xlsx";
		}
	
	@BeforeClass
	public void preConditions() throws EncryptedDocumentException, IOException, InterruptedException
	{
		homePage.clickOnGenderButton();
		Thread.sleep(1000);
		healthPlanPage.clickOnNextButton();
		Thread.sleep(1000);
		memberDetailsPage.handleAgeDropDown(Utility.readDataFromExcel(filepath,"Sheet2", 0, 0));

		memberDetailsPage.clickOnNextButton();
		Thread.sleep(1000);
		addressDetailsPage.enterPincode(Utility.readDataFromExcel(filepath, "Sheet2",0, 1));

		addressDetailsPage.enterMobileNumber(Utility.readDataFromExcel(filepath,"Sheet2", 0, 2));

		addressDetailsPage.clickOnContinueButton();
	}
	@Test
	public void validatebanner() throws InterruptedException
	{
		Thread.sleep(4000);
		int StringplanNumbers=resultPage.getPlanNumersFromString();
		int bannerplanNumbers=resultPage.getPlanNumersFromBanners();
		Assert.assertEquals(StringplanNumbers,bannerplanNumbers,"They are not equal,TC is failed" );
	}
	public void validatePresenceOfSortButton() throws InterruptedException, IOException
	{

	Thread.sleep(4000);
	Assert.assertTrue(resultPage.sortPlanFilterIsDisplayed(), "Sort Plan filter is not displayed,TC is failed");

	Utility.takeScreenShot(driver, "ScreenshotFolder");
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
	browserclose();
	}
	

}
