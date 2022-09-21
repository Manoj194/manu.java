package tyss.SDET40_genericFiles;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;
import com.google.common.io.Files;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class WebDriverUtility {
	Select s;
//WebDriver driver;
	// public static WebDriver main(String[] args) {
	// TODO Auto-generated method stub
	/**
	 * This method use to the launch the browser 
	 * author Manoj browser
	 * @return
	 * @return
	 */
	public WebDriver webDriverlaunchbrowser(String browser) {
		WebDriver driver = null;
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();// method changing
			driver = new ChromeDriver();// abstraction

			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("you entered wrong browser in excel");
			break;
		}
		return driver;

	}

	/**
	 * This method use to maximize the browser author Manoj
	 */
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method use to wait the controller implicitly till end author Manoj
	 */
	public void waittillpageload(WebDriver driver, long longTimeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longTimeout));
	}

	/**
	 * This method use to open the application author Manoj
	 */
	public void Opentheapplication(WebDriver driver,String url) {
		driver.get(url);
	}

	/**
	 * This method use to handle alert popup author Manoj
	 */
	public void Alertpopup(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void Alertpopup1(WebDriver driver) {
		Alert b = driver.switchTo().alert();
		b.accept();

	}

	/**
	 * This method used to mouceover action
	 */
	public void Mouceoveraction(WebDriver driver, WebElement element) {
		new Actions(driver).moveToElement(element).perform();
	}

	/**
	 * This mettod use to dropdownhandling
	 */
	public void DropdownByText(WebElement element, String value)

	{
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public void DropdownByValue(WebElement element, String value) {
		Select s1 = new Select(element);
		s1.selectByValue(value);
	}

	public void DropdownByIndex(WebElement element, String value) {
		Select s2 = new Select(element);
		s2.selectByIndex(0);
	}

	/**
	 * This method use to ClosetheBrowser
	 * 
	 * @param driver
	 */
	public void CloseBrowser(WebDriver driver) {
		driver.quit();
	}

	/**
	 * This method use to Launch browser,maximize browser,Wait page
	 * implicit,navigate application browser long timeout url return
	 */
	public WebDriver OpenBrowserApplication(String browser, long longtimeout1, String url1) {
		WebDriver driver = webDriverlaunchbrowser(browser);
		maximizeBrowser(driver);
		long longtimeout2 = 0;
		waittillpageload(driver, longtimeout1);
		Opentheapplication(driver,url1);
		return driver;

	}

	/**
	 * This method used for convertDynamicXpath Into Webelement
	 * 
	 * @param dynamicxpath
	 * @param replacedata
	 * @param driver
	 * @return
	 */
	public WebElement convertDynamicXpathIntoWebelemn(String dynamicxpath, String replacedata, WebDriver driver) {
		// TODO Auto-generated method stub
		String reqiredXpath = String.format(dynamicxpath, replacedata);
		WebElement element = driver.findElement(By.xpath(reqiredXpath));
		return element;
	}

	public WebElement convertDynamicXpathIntoWebelemnt(String dynamicxpath, String replacedata, WebDriver driver) {
		// TODO Auto-generated method stub
		String reqiredXpath1 = String.format(dynamicxpath, replacedata);
		WebElement element = driver.findElement(By.xpath(reqiredXpath1));
		return element;

	}

	/**
	 * This method used for Get Screenshot
	 * 
	 * @param driver
	 * @param screenshotname
	 * @throws IOException
	 */
	public void takeScreenShot(WebDriver driver, JavaUtility javaUtility, String screenshotname) throws IOException {

		String currentTime = javaUtility.CurrentTime();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dsc = new File("./screenshot/" + screenshotname + "_" + currentTime + ".png");
		FileUtils.copyFile(src, dsc);
	}
}

