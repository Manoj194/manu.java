package PracticeTestCase;

import java.io.IOException;
import java.util.Map;

import org.gouff.objectRepository.AdminLogin;
import org.gouff.objectRepository.CommonAction;
import org.gouff.objectRepository.CommonActionForUser;
import org.gouff.objectRepository.CommonActionforDeleteIcon;
import org.testng.annotations.Test;

import tyss.SDET40_genericFiles.BaseClassUtility;
import tyss.SDET40_genericFiles.WebDriverUtility;

public class UserRegistrationTestCase extends BaseClassUtility {
	@Test
	public void UserRegistrationTestCaseWithTestNG1() throws InterruptedException, IOException {
		Map<String, String> map = excelUtility.getDataFromExcelInMap("Testdata");
		String Username = map.get("UN");
		String Firstname = map.get("FN");
		String Lastname = map.get("LN");
		String Email = map.get("Email");
		String Mobno = map.get("Mob_no");
		String Password = map.get("PWD");
		String Cpassword = map.get("C_PWD");
		String Address = map.get("Address");
		String UN = map.get("UN1");
		String URL1 = map.get("Admin_URL");
		String PWD = map.get("PWD1");
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		CommonAction a = new CommonAction(driver);
		a.Registration1();
		a.Userlogin(Username, Firstname, Lastname, Email, Mobno, Password, Cpassword, Address);
		driver = webDriverUtility.OpenBrowserApplication("chrome", 10, URL1);
		a.Registration1();
		a.Userlogin(Username, Firstname, Lastname, Email, Mobno, Password, Cpassword, Address);
		driver = webDriverUtility.OpenBrowserApplication("chrome", 10, URL1);
		AdminLogin a2 = new AdminLogin(driver);
		a2.loginAction2(UN, PWD);
		CommonActionForUser cm = new CommonActionForUser(driver);
		cm.user2();
		CommonActionforDeleteIcon cn = new CommonActionforDeleteIcon(driver);
		cn.DeleteIcon1(Username);
	}
}
