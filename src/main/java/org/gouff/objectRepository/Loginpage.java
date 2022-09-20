package org.gouff.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath = "//a[text()='Login']")private WebElement loginbutton1;
		@FindBy(xpath = "//input[@type='text']")private WebElement userNameTextfield;
		@FindBy(xpath = "//input[@type='password']")private WebElement PasswordTextfield;
		@FindBy(xpath = "//input[@type='submit']")private WebElement LoginButton1;
		
		//initaliazation of all the element
		public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//business library
		public void loginAction(String username,String password) {
			loginbutton1.click();
			userNameTextfield.sendKeys(username);
			PasswordTextfield.sendKeys(password);
			LoginButton1.click();}
}
			
	
		
		


