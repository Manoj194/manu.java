package PracticeTestCase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		URL url=new URL("http://192.168.0.201:7353");
		WebDriver driver=new RemoteWebDriver(url, cap);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
	}

}
