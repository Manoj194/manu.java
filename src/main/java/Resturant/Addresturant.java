package Resturant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import tyss.SDET40_genericFiles.BaseClassUtility;
import tyss.SDET40_genericFiles.ExcelUtility;
import tyss.SDET40_genericFiles.Iconstantpath;
import tyss.SDET40_genericFiles.WebDriverUtility;
//import tyss.SDET40_genericFiles.Iconstantpath.iconstantceutility;

public class Addresturant extends BaseClassUtility{

	@Test
	public void AddResturant() {	
		// TODO Auto-generated method stub
	String UN = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"AddingResturant",0,1);
		String URL = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"AddingResturant",2,1);
		String PWD = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"AddingResturant",1,1);
		String Dropdownvalue = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"AddingResturant",3,1);
		String Dropdowntext= new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"AddingResturant",4,1);
		String  Dropdownvalue2= new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"AddingResturant",5,1);
		String Dropdowntext2 = new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"AddingResturant",6,1);
		String Address= new ExcelUtility ().getDataFromExcl(Iconstantpath.EXCELPATH,"AddingResturant",7,1);
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		driver = webDriverUtility.OpenBrowserApplication("chrome", 10, URL);
		webDriverUtility.maximizeBrowser(driver);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys( PWD);
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    driver.findElement(By.xpath("//span[.='Restaurant']")).click();
	    driver.findElement(By.xpath("//a[@href='add_restaurant.php']")).click();
	    driver.findElement(By.xpath("//input[@name='res_name']")).sendKeys("Navarang Resturant");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9902990502");
		driver.findElement(By.xpath("//label[text()='Bussiness E-mail']/ancestor::div[@class='form-group has-danger']//input[@type='text']")).sendKeys("manuvirat772@gmail.com");//(//input[@type='text'])[2]
		driver.findElement(By.xpath("//label[text()='Website URL']/ancestor::div[@class='form-group has-danger']//input[@type='text']")).sendKeys("www.https.com");
		WebElement k = driver.findElement(By.xpath("(//select[@class='form-control custom-select'])[1]"));
		webDriverUtility.DropdownByValue(k, Dropdownvalue);
		WebElement t = driver.findElement(By.xpath("//select[@name='o_days']"));
		webDriverUtility.DropdownByText(t, Dropdowntext);
		WebElement r = driver.findElement(By.xpath("//select[@name='c_name']"));
	    webDriverUtility.DropdownByText(r,Dropdownvalue2 );
        WebElement y = driver.findElement(By.xpath("//select[@name='c_hr']"));
	    webDriverUtility.DropdownByValue(y,Dropdowntext2);
	    driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(Address);
	    driver.findElement(By.xpath("//input[@name='file']")).sendKeys(Iconstantpath.PROJECT_PATH + "/src/test/resources/screenshot.png");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	   webDriverUtility.CloseBrowser(driver);
	}
}
	
	
		
		
		
		


