package org.gouff.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tyss.SDET40_genericFiles.WebDriverUtility;

public class CommonActionforDeleteIcon {
	WebDriver driver;
	WebDriverUtility webDriverUtility = new WebDriverUtility();

	// Declaration
	String dynamicXpath = "//tbody//tr//td[text()='%s']/following-sibling::td//a[@class='btn btn-danger btn-flat btn-addon btn-xs m-b-10']";

	/*
	 * initalization
	 */
	public CommonActionforDeleteIcon(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Business library
	 */
	public void DeleteIcon1(String replaceData) {
		WebElement element = webDriverUtility.convertDynamicXpathIntoWebelemn(dynamicXpath, replaceData, driver);
		System.out.println(element);
		element.click();
	}
}
