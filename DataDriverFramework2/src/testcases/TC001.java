package testcases;

import commonMethods.commonmethods;
import constantValues.constantvalues;
import pages.landingpage;
import utilities.locator_values;

public class TC001 {
	public static void tc001() throws Exception {
	commonmethods.browserName(constantvalues.browserName);
	commonmethods.openUrl(constantvalues.url);
	Thread.sleep(2000);
	landingpage.membership(locator_values.membership);
	landingpage.individual(locator_values.individual);
}
}
