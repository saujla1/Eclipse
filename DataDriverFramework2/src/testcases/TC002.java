package testcases;

import commonMethods.commonmethods;
import pages.membership;
import pages.shoppingcart;
import utilities.locator_values;

public class TC002 {
	public static void tc002() throws Exception {
commonmethods.scrolling();
		
		membership.student(locator_values.studentbutton);
		//membership.alermsg();
		membership.totalmebprice(locator_values.totalmbrprice);
		membership.join(locator_values.joinnowbtn);
		Thread.sleep(4000);
		shoppingcart.fetchtotalprice(locator_values.ordertotal);
		shoppingcart.createaccount(locator_values.creataccount);
	}
}
