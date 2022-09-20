package org.gouff.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonActionForUser {
	WebDriver driver;

	// Declaration
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement user;

	/*
	 * initalization
	 */
	public CommonActionForUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Business library
	 */
	public void user2() {
		user.click();
	}

}