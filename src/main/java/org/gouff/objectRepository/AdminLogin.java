package org.gouff.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogin {
	@FindBy(xpath = "//input[@name='username']")private WebElement Username;
	@FindBy(xpath = "//input[@name='password']")private WebElement Password;
	@FindBy(xpath = "//input[@value='Login']")private WebElement  LoginButton;
	
	//initaliazation of all the element
	public AdminLogin (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//business library
	public void loginAction2(String UN ,String PWD) {
		Username.sendKeys(UN);
		Password.sendKeys(PWD);
		LoginButton.click();}
	
}

