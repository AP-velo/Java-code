package chromeoptions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ChromeoptionHeadless {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("headless");

		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String sns= RandomString.make(3);
		File dest = new File("C:\\Users\\a.pawar\\OneDrive - Serrala Group GmbH\\Documents\\SAP\\test324"+sns+".png");
		FileHandler.copy(src, dest);

	}

}
