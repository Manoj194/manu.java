package Resturant;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;
import tyss.SDET40_genericFiles.JavaUtility;
import tyss.SDET40_genericFiles.WebDriverUtility;

public class UserRegistrationAndDelete {

	private static final String Random = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		String manoj = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",0,1);
		String manoj1 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",1,1);
		String manoj2 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",2,1);
		String manoj3 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",12,1)+65;
		String manoj4 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",13,1);
		String manoj5 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",14,1);
		String manoj6 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",15,1);
		String manoj7 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",16,1);
		String manoj8 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",17,1);
		String manoj9 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",18,1);
		String manoj0 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",19,1);
		
		String manoj21 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",5,1);
		String manoj31 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",4,1);
		String manoj41 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",6,1);
		WebDriverUtility webdriverutility = new WebDriverUtility();
		JavaUtility j = new JavaUtility();
		int Random = j.RandomNumber(1000);
		driver=webdriverutility.webDriverlaunchbrowser("chrome");
		webdriverutility.waittillpageload(driver, 10);
		webdriverutility.Opentheapplication(driver, manoj2);
		webdriverutility.maximizeBrowser(driver);
		
		System.out.println("manu");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(manoj);    
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(manoj1);    
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();   
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(manoj3);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys( manoj4);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys( manoj5);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys( manoj6);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys( manoj7);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys( manoj8);
		driver.findElement(By.xpath("//input[@name='cpassword']")).sendKeys( manoj9);
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys( manoj0);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		System.out.println( manoj3);
		driver=webdriverutility.webDriverlaunchbrowser("chrome");
		webdriverutility.Opentheapplication(driver, manoj31);
		webdriverutility.waittillpageload(driver, 10);
		webdriverutility.maximizeBrowser(driver);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(manoj21);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys( manoj41);
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Users']")).click();
	    driver.findElement(By.xpath("//tbody//tr//td[text()='"+manoj3+"']/following-sibling::td//a[@class='btn btn-danger btn-flat btn-addon btn-xs m-b-10']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//img[@class='profile-pic']")).click();
        driver.findElement(By.xpath("//i[@class='fa fa-power-off']")).click();
	    webdriverutility.CloseBrowser(driver);

	
	}
}