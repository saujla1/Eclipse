package testcases;

import constantValues.constantvalues;
import pages.addressbook;
import utilities.locator_values;

public class TC003 {
		public static void tc003() throws Exception{
			addressbook.firstname(locator_values.firstname,constantvalues.firstname);
			addressbook.lastname(locator_values.lastname, constantvalues.lastname);
			addressbook.username(locator_values.username, constantvalues.username);
			addressbook.password(locator_values.password, constantvalues.password);
			addressbook.cnfrmpassword(locator_values.cnfrmpassword, constantvalues.cofrmpassword);
			addressbook.email(locator_values.email, constantvalues.email);
			addressbook.company(locator_values.company, constantvalues.company);
			addressbook.streetname(locator_values.street, constantvalues.streetName);
			addressbook.country(locator_values.country, constantvalues.country);
			addressbook.state(locator_values.state, constantvalues.state);
			addressbook.city(locator_values.city, constantvalues.cityName);
			addressbook.username(locator_values.zipcode, constantvalues.zipCode);
			addressbook.username(locator_values.phone, constantvalues.phone);
		}
}
