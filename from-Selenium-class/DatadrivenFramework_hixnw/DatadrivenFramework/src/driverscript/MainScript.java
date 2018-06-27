package driverscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commonMthods.ActionKeywords;
import constantvalues.Constantvalues;
import pages.AddressbookPage;
import pages.Landingpage;
import pages.MembershipPage;
import pages.Shoppingcartpage;
import utilities.Locator_Values;
import utilities.Readwrite;

public class MainScript {
		  
		public static void main(String[] args) throws Exception {
			
			Readwrite.setexcelpath(Constantvalues.excelpath);
			ActionKeywords.selectBrowser(Constantvalues.testBrowser);
			ActionKeywords.openURL(Constantvalues.url);
			
			Landingpage.mmbrshplnk(Locator_Values.mmbrshplnk);
			Landingpage.individualLink(Locator_Values.individualLink);

			ActionKeywords.scrolling();
			MembershipPage.cartVal(Locator_Values.cartVal);
			MembershipPage.joinNowbtn(Locator_Values.joinNowbtn);
			
			Shoppingcartpage.totalpriceshpngcart(Locator_Values.totalpriceshpngcart);
			Shoppingcartpage.createaccnt(Locator_Values.createaccnt);
			
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
