package testcases;

import commonMthods.ActionKeywords;
import constantvalues.Constantvalues;
import pages.Landingpage;
import utilities.Locator_Values;

public class TC001 {

	public static void tc001() throws Exception {
		ActionKeywords.selectBrowser(Constantvalues.testBrowser);
		ActionKeywords.openURL(Constantvalues.url);
		
		Landingpage.mmbrshplnk(Locator_Values.mmbrshplnk);
		Landingpage.individualLink(Locator_Values.individualLink);

		ActionKeywords.scrolling();
	}
}
