package org.gouff.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonAction {
	WebDriver driver;

	// Registration

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement RegisterButton;

	public CommonAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// business library
	public void Registration1() {
		RegisterButton.click();
	}

	/*
	 * View menu Declaration
	 */

	@FindBy(xpath = "(//a [@class='btn btn-purple'])[1]")
	private WebElement viewmenuButton;

	/*
	 * initalization
	 */
	public void CommonAction2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Business library
	 */
	public void viewbutton1() {
		viewmenuButton.click();
	}

	// Declaration____Add to cart

	@FindBy(xpath = "(//span[text()='$14.00']/ancestor::div[@class='col-xs-12 col-sm-12 col-lg-3 pull-right item-cart-info']//input[@value='Add To Cart'])")
	private WebElement AddToCart;

	// Initaliization
	public void CommonAction3(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Business library
	public void AddtoCart1() {
		AddToCart.click();
	}
	
	/**
	 * This 00e00000000000000000000000.lement used for Clicking Delete Icon
	 */
	@FindBy(xpath = "(//i[@class='fa fa-trash pull-right'])")
	private WebElement DeleteIcon;

	/*
	 * initalization
	 */
	public void CommonAction9(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Business library
	 */
	public void  DeleteIcon() {
		DeleteIcon.click();
	}
	

	// declaration
	@FindBy(xpath = "(//a[@class='btn btn-success btn-lg active'])")
	private WebElement checkoutButton;

	/*
	 * initalization
	 */
	public void CommonAction4(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Business library
	 */
	public void checkoutbutton1() {
		checkoutButton.click();
	}

	// declaration
	@FindBy(xpath = "(//input[@name='submit'])")
	private WebElement order;

	/*
	 * initalization
	 */
	public void CommonAction5(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Business library
	 */
	public void order1() {
		order.click();
	}

	// Declaration
	@FindBy(xpath = "(//a[text()='Logout'])")
	private WebElement Logout;

	/*
	 * initalization
	 */
	public void CommonAction6(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Business library
	 */
	public void Logout1() {
		Logout.click();
	}

	// USER REGISTRATION TESTCASE

	// Declaration
	// User Login
	@FindBy(xpath = "(//input[@name='username'])")
	private WebElement UN;
	@FindBy(xpath = "(//input[@name='firstname'])")
	private WebElement FN;
	@FindBy(xpath = "(//input[@name='lastname'])")
	private WebElement LN;
	@FindBy(xpath = "(//input[@name='email'])")
	private WebElement EML;
	@FindBy(xpath = "(//input[@name='phone'])")
	private WebElement PHN;
	@FindBy(xpath = "(//input[@name='password'])")
	private WebElement PWD;
	@FindBy(xpath = "(//input[@name='cpassword'])")
	private WebElement CPWD;
	@FindBy(xpath = "(//textarea[@name='address'])")
	private WebElement ADD;
	@FindBy(xpath = "(//input[@value='Register'])")
	private WebElement clicking;

	// Initalization
	public void UserLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// business library
	public void Userlogin(String Username, String Firstname, String Lastname, String Email, String Mobno,
			String Password, String Cpassword, String Address) {
		UN.sendKeys(Username);
		FN.sendKeys(Firstname);
		LN.sendKeys(Lastname);
		EML.sendKeys(Email);
		PHN.sendKeys(Mobno);
		PWD.sendKeys(Password);
		CPWD.sendKeys(Cpassword);
		ADD.sendKeys(Address);
		clicking.click();
	}
	
	/**
	 * Admin Login
	 */

	// Declaration
	@FindBy(xpath = "(//input[@name='username'])")
	private WebElement UN1;
	@FindBy(xpath = "(//input[@name='password'])")
	private WebElement PWD1;
	@FindBy(xpath = "(//input[@value='Login'])")
	private WebElement click1;

	// Initalization
	public void AdminLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Business library
	public void Adminlogin(String UN, String PWD) {
		UN1.sendKeys(UN);
		PWD1.sendKeys(PWD);
		click1.click();

	}
	/**
	 *  Click resturant
	 */

	// declaration
	
	@FindBy(xpath = "(//span[.='Restaurant'])")
	private WebElement click2;

	// initalization
	public void Resturant(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// businee liibrary
	public void Resturant() {
		click2.click();
	}

	// clicking Add Resturant
	@FindBy(xpath = "(//a[@href='add_restaurant.php'])")
	private WebElement click3;

	// initalization
	public void ADDResturant(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void AddResturant() {
		click3.click();
	}

	//

	// Declaration
	@FindBy(xpath = "(//input[@name='res_name'])")
	private WebElement Resname;
	@FindBy(xpath = "(//input[@name='phone'])")
	private WebElement Mobno1;
	@FindBy(xpath = "(//label[text()='Bussiness E-mail']/ancestor::div[@class='form-group has-danger']//input[@type='text'])")
	private WebElement email;
	@FindBy(xpath = "(//label[text()='Website URL']/ancestor::div[@class='form-group has-danger']//input[@type='text'])")
	private WebElement Website1;

	// Initalization
	public void Sendkeys(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Sendkeys(String Restname, String Mobno, String Email, String Website) {
		Resname.sendKeys(Restname);
		Mobno1.sendKeys(Mobno);
		email.sendKeys(Email);
		Website1.sendKeys(Website);

	}

	// Declaration
	@FindBy(xpath = "(//textarea[@name='address'])")
	private WebElement Addresss;

	// Initalization
	public void Address1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Business library
	public void Address1(String Address) {
		Addresss.sendKeys(Address);

	}

	// Declaration
	// Subit
	@FindBy(xpath = "(//input[@type='submit'])")
	private WebElement submit4;

	// Initalization
	public void Submit1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Business library
	public void Submit1() {
		submit4.click();
	}

}
