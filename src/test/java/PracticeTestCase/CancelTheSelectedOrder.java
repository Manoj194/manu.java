package PracticeTestCase;

import org.gouff.objectRepository.CommonAction;
import org.gouff.objectRepository.Enum1;
import org.gouff.objectRepository.resturant;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import tyss.SDET40_genericFiles.BaseClassUtility;

public class CancelTheSelectedOrder extends BaseClassUtility {
	@Test
	public void CancelTheSelectedOrder1() throws InterruptedException
	{
		resturant k = new resturant(driver);
		k.clickRequiredTab(Enum1.RESTURANTS, webDriverUtility);
		CommonAction a = new CommonAction(driver);
		a.viewbutton1();
		a.AddtoCart1();
		a.DeleteIcon();
	}

}
