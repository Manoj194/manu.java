
package org.gouff.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tyss.SDET40_genericFiles.WebDriverUtility;

public class resturant {
	// public static resturant Restaurants;
	private WebDriver driver;
	private String dynamicxpath = "//a[contains(.,'%s')]";

	// @FindBy(xpath = "//a[text()='Restaurants ']")
	// private WebElement ResturantText;
	/*
	 * initalization
	 */
	public resturant(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Business library
	 */
	public void clickRequiredTab(Enum1 restaurants, WebDriverUtility WebDriverUtility) {
		WebDriverUtility.convertDynamicXpathIntoWebelemn(dynamicxpath, restaurants.getEnum1(), driver).click();

	}

}
