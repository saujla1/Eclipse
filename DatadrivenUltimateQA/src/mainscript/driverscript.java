package mainscript;

import commonmethods.commonmethods;
import constantvalues.constvalues;
import data.locatorvalues;
import pages.landingpage;
import pages.simpleelementspage;

public class driverscript {
	public static void main(String[] args) throws InterruptedException {
		commonmethods.browsername(constvalues.browsername);
		commonmethods.openurl(constvalues.url);
		
		landingpage.simpleelementslink(locatorvalues.simpleelements);
		Thread.sleep(4000);
		simpleelementspage.gettablecontent(locatorvalues.button);
	}
}
