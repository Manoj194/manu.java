package Resturant;

import org.gouff.objectRepository.CommonAction;
import org.gouff.objectRepository.Enum1;
import org.gouff.objectRepository.Loginpage;
import org.gouff.objectRepository.resturant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;
import tyss.SDET40_genericFiles.WebDriverUtility;

public class UpdatedTestCase11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
	    ExcelUtility excelUtility = new	ExcelUtility();
		String manoj = excelUtility.getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",0,1);
		String manoj1 = excelUtility.getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",1,1);
		String manoj2 = excelUtility.getDataFromExcl(Iconstantpath.EXCELPATH,"Testdata",2,1);
		WebDriverUtility webdriverutility = new WebDriverUtility();
		driver=webdriverutility.OpenBrowserApplication("chrome", 10, manoj2);
		Loginpage loginpage = new Loginpage(driver);
		loginpage.loginAction(manoj, manoj1);
		resturant k = new resturant(driver);
		k.clickRequiredTab(Enum1.RESTURANTS, webdriverutility);
		CommonAction a=new CommonAction(driver);
		a.viewbutton1();
		a.AddtoCart1();
		a.checkoutbutton1();
		a.order1();
		//driver.findElement(By.xpath("(//a [@class='btn btn-purple'])[1]")).click();
		//driver.findElement(By.xpath("//span[text()='$14.00']/ancestor::div[@class='col-xs-12 col-sm-12 col-lg-3 pull-right item-cart-info']//input[@value='Add To Cart']")).click();
	  //  driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg active']")).click();	
	   // driver.findElement(By.xpath("//input[@name='submit']")).click();
	    webdriverutility.Alertpopup(driver);
	    webdriverutility.Alertpopup1(driver);
	    a.Logout1();
	  //  driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    webdriverutility.CloseBrowser(driver);
	 
		

	}

}
