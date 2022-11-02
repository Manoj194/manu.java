package PracticeTestCase;

import org.gouff.objectRepository.CommonAction;
import org.gouff.objectRepository.Enum1;
import org.gouff.objectRepository.resturant;
import org.testng.Assert;
import org.testng.annotations.Test;

import tyss.SDET40_genericFiles.BaseClassUtility;

public class PlaceTheOrder extends BaseClassUtility {
	@Test
	public void UpdateTestCaseWithTestNG() {
		resturant k = new resturant(driver);
		k.clickRequiredTab(Enum1.RESTURANTS, webDriverUtility);
		CommonAction a = new CommonAction(driver);
		a.viewbutton1();
		a.AddtoCart1();
		a.checkoutbutton1();
		//Assert.fail();
		a.order1();
		webDriverUtility.Alertpopup(driver);
		webDriverUtility.Alertpopup1(driver);
		a.Logout1();
	}
}
