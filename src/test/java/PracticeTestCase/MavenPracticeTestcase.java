package PracticeTestCase;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;
import tyss.SDET40_genericFiles.WebDriverUtility;

public class MavenPracticeTestcase {
	WebDriver driver;

	@Test
	
	public  void step1Test() {

		String browser =System.getProperty("b");
		String url =System.getProperty("u");

		System.out.println("browser name is"+browser);
		System.out.println("url is"+url);
		
		WebDriverUtility web=new WebDriverUtility(); 
		WebDriver Driver= web.webDriverlaunchbrowser(browser);
		web.Opentheapplication(driver, url);
	}

}
