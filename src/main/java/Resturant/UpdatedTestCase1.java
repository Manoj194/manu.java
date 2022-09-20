package Resturant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;
import tyss.SDET40_genericFiles.WebDriverUtility;

public class UpdatedTestCase1 {

	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=null;
		String manoj = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",0,1);
		String manoj1 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",1,1);
		String manoj2 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",2,1);
		WebDriverUtility webdriverutility = new WebDriverUtility();
		webdriverutility.webDriverlaunchbrowser("chrome");
		webdriverutility.waittillpageload(driver, 100);
		webdriverutility.Opentheapplication(driver, manoj2);
		webdriverutility.maximizeBrowser(driver);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(manoj );
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(manoj1);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Restaurants ']")).click();
		driver.findElement(By.xpath("(//a [@class='btn btn-purple'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='$14.00']/ancestor::div[@class='col-xs-12 col-sm-12 col-lg-3 pull-right item-cart-info']//input[@value='Add To Cart']")).click();
	    driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg active']")).click();	
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    webdriverutility.Alertpopup(driver);
	    webdriverutility.Alertpopup1(driver);
	    driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    webdriverutility.CloseBrowser(driver);
	 
		


	}
}
		