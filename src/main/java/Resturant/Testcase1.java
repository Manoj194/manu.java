//Place the order throught restuarant module
package Resturant;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tyss.SDET40_genericFiles.WebDriverUtility;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		FileInputStream fis=new FileInputStream("./src/test/resources/manu777.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Testdata");
		String manu=sheet.getRow(0).getCell(1).getStringCellValue();
		String manu1=sheet.getRow(1).getCell(1).getStringCellValue();
		WebDriverUtility webdriverutility = new WebDriverUtility();
		driver=webdriverutility.webDriverlaunchbrowser("chrome");
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://rmgtestingserver/domain/Online_Food_Ordering_System/index.php");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='nav-link active'])[3]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(manu);
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(manu1);
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("(//a [@class='nav-link active'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a [@class='btn btn-purple'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg active']")).click();	
	    Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='submit']")).click();
	    Thread.sleep(2000);
	   Alert a = driver.switchTo().alert();	
	      a.accept();	
		    Thread.sleep(2000);
	     Alert a1 = driver.switchTo().alert();	
	     a1.accept();
		   Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[@class='nav-link active'])[4]")).click();	
	    Thread.sleep(2000);

		


	}

}