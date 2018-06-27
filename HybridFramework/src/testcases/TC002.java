package testcases;

import pages.MembershipPage;
import pages.Shoppingcartpage;
import utilities.Locator_Values;

public class TC002 {

	public static void tc002() throws Exception {
		MembershipPage.cartVal(Locator_Values.cartVal);
		MembershipPage.joinNowbtn(Locator_Values.joinNowbtn);
		
		Shoppingcartpage.totalpriceshpngcart(Locator_Values.totalpriceshpngcart);
		Shoppingcartpage.createaccnt(Locator_Values.createaccnt);
	}
}
