package Resturant;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.
		manage().window().maximize();
		driver.get("https://www.ajio.com/?gclid=EAIaIQobChMI8LaO6Zfh-QIVa5VLBR2nsQq3EAAYASAAEgJbRfD_BwE");
		Thread.sleep(2000);
		//Alert a = driver.switchTo().alert();
		//a.dismiss();
		//Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@title='KIDS']")).click();	
		Thread.sleep(2000);
		// comments
		//Modification done by me jbdkcjvweh
		//,knlebfljb
		


	}

}
