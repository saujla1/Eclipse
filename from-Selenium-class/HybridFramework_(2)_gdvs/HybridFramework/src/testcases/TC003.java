package testcases;

import constantvalues.Constantvalues;
import pages.AddressbookPage;
import utilities.Locator_Values;

public class TC003 {

	public static void tc003() throws Exception {
		AddressbookPage.frstName(Locator_Values.frstName, Constantvalues.firstName);
		AddressbookPage.lasttName(Locator_Values.lasttName, Constantvalues.lastName);
		AddressbookPage.userName(Locator_Values.userName, Constantvalues.username);
		AddressbookPage.password(Locator_Values.password, Constantvalues.password);
		AddressbookPage.cnfrmpsswd(Locator_Values.cnfrmpsswd, Constantvalues.confirmPassword);
		AddressbookPage.companyName(Locator_Values.companyName, Constantvalues.companyName);
		AddressbookPage.emailid(Locator_Values.emailid, Constantvalues.emailID);
		AddressbookPage.streetName(Locator_Values.streetName, Constantvalues.streetName);
		AddressbookPage.countryName(Locator_Values.countryName, Constantvalues.countryName);
		AddressbookPage.stateName(Locator_Values.stateName, Constantvalues.stateName);
		AddressbookPage.cityName(Locator_Values.cityName, Constantvalues.cityName);
		AddressbookPage.zipCode(Locator_Values.zipCode, Constantvalues.zipcode);
		AddressbookPage.phonenumber(Locator_Values.phonenumber, Constantvalues.phoneNumber);
	}
}
