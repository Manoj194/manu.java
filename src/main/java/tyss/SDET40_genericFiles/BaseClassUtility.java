package tyss.SDET40_genericFiles;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.gouff.objectRepository.AdminLogin;
import org.gouff.objectRepository.CommonAction;
import org.gouff.objectRepository.CommonActionForUser;
import org.gouff.objectRepository.CommonActionforDeleteIcon;
import org.gouff.objectRepository.Enum1;
import org.gouff.objectRepository.Loginpage;
import org.gouff.objectRepository.resturant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassUtility {
	private String manoj;
	private String manoj1;
	private String manoj2;
	private Loginpage loginpage;
	protected WebDriver driver;
	protected static WebDriver sdriver;
	protected WebDriverUtility webDriverUtility;
	protected ExcelUtility excelUtility;
	protected CommonAction a;
	//protected Map<String, String> map;
//	protected Map<String, String> map1;
	//protected String sheetName1 = "AddingResturant";
	//protected String sheetName = "Testdata";
	protected JavaUtility j;
	protected static JavaUtility sjava;
	protected AdminLogin adminLogin;

	/**
	 * Initalize all the utilities Open the excel and property file Read the common
	 * data Create the instsnce for the browser maximize,implicitly wait Open the
	 * application Initalize the action,Webdriverwait Create the instance for the
	 * common object repo @ throw IoExceptipon
	 * 
	 * @param args
	 * @throws IOException
	 * @throws EncryptedDocumentException
	 */

	@BeforeClass
	public void ClassSetup() throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		excelUtility = new ExcelUtility();
		webDriverUtility = new WebDriverUtility();
		j = new JavaUtility();
		sjava = j;
		a = new CommonAction(driver);
		CommonActionforDeleteIcon cm = new CommonActionforDeleteIcon(driver);
		CommonActionForUser a1 = new CommonActionForUser(driver);
		resturant k = new resturant(driver);

		/*
		 * Open the excel and property file
		 */
		excelUtility.OpenExcel(Iconstantpath.EXCELPATH);

		// Get the data from excelfile

		manoj = excelUtility.getDataFromExcl(Iconstantpath.EXCELPATH, "Testdata", 16, 1);
		manoj1 = excelUtility.getDataFromExcl(Iconstantpath.EXCELPATH, "Testdata", 17, 1);
		manoj2 = excelUtility.getDataFromExcl(Iconstantpath.EXCELPATH, "Testdata", 18, 1);

		
	//	map=excelUtility.getDataFromExcelInMap1(sheetName1);

		// Launching the browser and doing some browser setting

		driver = webDriverUtility.OpenBrowserApplication("chrome", 10, manoj2);
		sdriver = driver;
		
		// Create object for common pom repo
		loginpage = new Loginpage(driver);
	}

	// Login to the application
	/**
	 * When ever create the testscript class for module and test annotation method
	 * for testcase Create the instance for launch browseer maximise,implicitly wait
	 * Initalize the action,Webdriverwait Create the instance for the common object
	 * repo Login to the app
	 */
	@BeforeMethod
	public void methodSetUP1() {
		loginpage.loginAction(manoj, manoj1);

	}

	// @AfterMethod
	// public void methodTearDown() {
	// Logout from the application

	// }

	@AfterClass
	public void ClassTearDown() {
		webDriverUtility.CloseBrowser(driver);

	}

}
