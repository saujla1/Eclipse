package testCases;

import PageObjects.loginPage;
import commonMethods.ActionKeywords;
import constantValues.constantvalues;
import utilities.locator_values;

public class TCOO2 {
	public static void tc002() throws Exception {
		ActionKeywords.browserName(constantvalues.testbrowser);
		ActionKeywords.openURL(constantvalues.URL);
		
		loginPage.loginBtn(locator_values.loginbtn);
		loginPage.email(locator_values.emailID, constantvalues.emailID);
		Thread.sleep(2000);
		loginPage.password(locator_values.password, constantvalues.password);
		loginPage.login(locator_values.login);
		Thread.sleep(4000);
		loginPage.scrolling();
		loginPage.bloglink(locator_values.blog);
		loginPage.searchboxtext(locator_values.searchtextbox);
		loginPage.clicksearchlink(locator_values.searchlink);
		loginPage.interviewTab(locator_values.inteviewtab);
		
		
	}

}
