package Resturant;

import org.gouff.objectRepository.AdminLogin;
import org.gouff.objectRepository.CommonAction;
import org.gouff.objectRepository.CommonActionForUser;
import org.gouff.objectRepository.CommonActionforDeleteIcon;
import org.gouff.objectRepository.Enum1;
import org.gouff.objectRepository.Loginpage;
import org.gouff.objectRepository.resturant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;
import tyss.SDET40_genericFiles.JavaUtility;
import tyss.SDET40_genericFiles.WebDriverUtility;

public class UserRegistrartion2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String manoj = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",0,1);
		String manoj1 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",1,1);
		String manoj2 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",2,1);
		String manoj3 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",12,1)+67;
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
		driver=webdriverutility.OpenBrowserApplication("chrome", 10, manoj2);
		CommonAction a = new CommonAction(driver);
		Loginpage login = new Loginpage(driver);
		login.loginAction(manoj, manoj1);
	    driver.findElement(By.xpath("//a[text()='Logout']")).click();  
		a.Registration1();
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
		driver=webdriverutility.OpenBrowserApplication("chrome", 10, manoj31);
	    AdminLogin al = new AdminLogin(driver);
	    al.loginAction2(manoj21, manoj41);
			driver.findElement(By.xpath("//span[text()='Users']")).click();
	    Thread.sleep(5000);
	   driver.findElement(By.xpath("//tbody//tr//td[text()='"+manoj3+"']/following-sibling::td//a[@class='btn btn-danger btn-flat btn-addon btn-xs m-b-10']")).click();
	   driver.findElement(By.xpath("//img[@class='profile-pic']")).click();
        driver.findElement(By.xpath("//i[@class='fa fa-power-off']")).click();
	    webdriverutility.CloseBrowser(driver);

	
	}
	

}
