package driverscript;



import commonMthods.ActionKeywords;
import constantvalues.constantvalues;
import pages.AddressBook;
import pages.LandingPage;
import pages.Membership;
import pages.ShoppingCart;
import utilities.Locator_values;
import utilities.ReadExcel;

public class MainScript {
	
	
	public static void main(String[] args) throws Exception {
		ReadExcel.setexcelpath(constantvalues.excelpath);
		ActionKeywords.browserName(constantvalues.browserName);
		ActionKeywords.openurl(constantvalues.url);
		
		LandingPage.membership(Locator_values.membership);
		LandingPage.individual(Locator_values.individual);
		
		Membership.cartVal(Locator_values.cartVal );
		Membership.JoinNowBtn(Locator_values.JoinNowBtn);
		Thread.sleep(2000);
		ShoppingCart.OrderTotal(Locator_values.OrderTotal);
		ShoppingCart.Login(Locator_values.Login);
		
		AddressBook.firstName(Locator_values.firstName,constantvalues.firstname);
		AddressBook.LastName(Locator_values.LastName, constantvalues.lastname);
		AddressBook.userName(Locator_values.userName, constantvalues.username);
		AddressBook.password(Locator_values.password,constantvalues.password);
		AddressBook.confirmPassword(Locator_values.confirmPassword,constantvalues.cofrmpassword);
		AddressBook.email(Locator_values.email,constantvalues.email);
		AddressBook.company(Locator_values.company,constantvalues.company);
		AddressBook.streetName(Locator_values.streetName, constantvalues.streetName);
		AddressBook.countryName(Locator_values.countryName,constantvalues.country);
		AddressBook.stateName(Locator_values.stateName,constantvalues.state);
		AddressBook.cityName(Locator_values.cityName,constantvalues.cityName);
		AddressBook.zipCode(Locator_values.zipCode,constantvalues.zipCode);
		AddressBook.phone(Locator_values.phone, constantvalues.phone);
		
		
		
		

	}

}
