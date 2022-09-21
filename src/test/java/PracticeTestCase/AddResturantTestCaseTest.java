package PracticeTestCase;

import java.util.Map;

import org.gouff.objectRepository.CommonAction;
import org.gouff.objectRepository.DropDownPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;

import tyss.SDET40_genericFiles.BaseClassUtility;
import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;
import tyss.SDET40_genericFiles.WebDriverUtility;

public class AddResturantTestCaseTest extends BaseClassUtility {
	WebDriver driver;

	@Test
	public void AddResturant() throws InterruptedException {
		// TODO Auto-generated method stub
	//manoj kumar bh
		Map<String, String> map = excelUtility.getDataFromExcelInMap("AddingResturant");
		String URL = map.get("URL");
		String UN = map.get("UN");																																																																																																																																																																																																																																																																																																																																																							
		String PWD = map.get("PWD");
		String value = map.get("Dropdownvalue");
		String Dropdowntext = map.get("Dropdowntext");
		String Dropdownvalue2 = map.get("Dropdownvalue2");
		String Dropdowntext2 = map.get("Dropdowntext2");
		String Address = map.get("Address");
		String Restname = map.get("Resturant_name");
		String Mobno = map.get("mob_no");
		String Email = map.get("Email");
		String Website = map.get("Website");
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		driver=webDriverUtility.OpenBrowserApplication("chrome", 10, URL);
		CommonAction a = new CommonAction(driver);
		a.Adminlogin(UN, PWD);
		a.Resturant();
		a.AddResturant();
		a.Sendkeys(Restname, Mobno, Email, Website);
		DropDownPage ddp = new DropDownPage();
		ddp.Dropdown(driver);
		WebElement k = ddp.addressDropdown();
		webDriverUtility.DropdownByValue(k, value);
		WebElement t = ddp.addressDropdown2();
		webDriverUtility.DropdownByText(t, Dropdowntext);
		WebElement r = ddp.addressDropdown3();
		webDriverUtility.DropdownByText(r, Dropdownvalue2);
		WebElement y = ddp.addressDropdown4();
		webDriverUtility.DropdownByText(y, Dropdowntext2);
		a.Address1(Address);
		driver.findElement(By.xpath("//input[@name='file']"))
		.sendKeys(Iconstantpath.PROJECT_PATH + "/src/test/resources/screenshot.png");
		a.Submit1();
		webDriverUtility.CloseBrowser(driver);
	}
}
