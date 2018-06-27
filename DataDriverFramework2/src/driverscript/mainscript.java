package driverscript;

import org.apache.log4j.xml.DOMConfigurator;

import constantValues.constantvalues;
import pages.addressbook;
import pages.landingpage;
import pages.membership;
import pages.shoppingcart;
import testcases.TC001;
import testcases.TC002;
import testcases.TC003;
import utilities.locator_values;
import utilities.log;
import utilities.readexcel;

public class mainscript {
	public static boolean bValue=true;
	public static void main(String[] args) throws Exception {
		readexcel.setExcelPath(constantvalues.excelpath);
		DOMConfigurator.configure("log4j.xml");
		
	//---------------------------------TC001------------------------------------------------------------------------------------------	
		if(readexcel.readValues(constantvalues.testscenariosheetname, 1, constantvalues.runmodeclm).equalsIgnoreCase("y")) {
			bValue=true;
			log.starttestcase("TC001");
			TC001.tc001();
			log.endtestcase();
			if (bValue==false) {
				readexcel.writeinexcel(constantvalues.testscenariosheetname, 1, constantvalues.status, "FAIL");
			}
			else {
				readexcel.writeinexcel(constantvalues.testscenariosheetname, 1, constantvalues.status, "PASS");
			}
		}
		else {
			System.out.println("Skip execution TC001");
			readexcel.writeinexcel(constantvalues.testscenariosheetname, 1, constantvalues.status, "SKIP");
		}
		
//-----------------------------------TC002-----------------------------------------------------------------------------------------		
		if(readexcel.readValues(constantvalues.testscenariosheetname, 2, constantvalues.runmodeclm).equalsIgnoreCase("y")) {
			bValue=true;
			log.starttestcase("TC002");
			TC002.tc002();
			log.endtestcase();
			if (bValue==false) {
				readexcel.writeinexcel(constantvalues.testscenariosheetname, 2, constantvalues.status, "FAIL");
			}
			else {
				readexcel.writeinexcel(constantvalues.testscenariosheetname, 2, constantvalues.status, "PASS");
			}
		}
		
		else {
			System.out.println("Skip execution TC002");
			readexcel.writeinexcel(constantvalues.testscenariosheetname, 2, constantvalues.status, "SKIP");
		}
//----------------------------------TC003----------------------------------------------------------------------------------------
		if(readexcel.readValues(constantvalues.testscenariosheetname, 3, constantvalues.runmodeclm).equalsIgnoreCase("y")) {
			bValue=true;
			log.starttestcase("TC003");
			TC003.tc003();
			log.endtestcase();
			if (bValue==false) {
				readexcel.writeinexcel(constantvalues.testscenariosheetname, 3, constantvalues.status, "FAIL");
			}
			else {
				readexcel.writeinexcel(constantvalues.testscenariosheetname, 3, constantvalues.status, "PASS");
			}
		}
		
		else {
			System.out.println("Skip execution TC003");
			readexcel.writeinexcel(constantvalues.testscenariosheetname, 3, constantvalues.status, "SKIP");
		}
		
		
		
		
		
//		commonmethods.browserName(constantvalues.browserName);
//		commonmethods.openUrl(constantvalues.url);
//		Thread.sleep(2000);
//		landingpage.membership(locator_values.membership);
//		landingpage.individual(locator_values.individual);
//		
//		commonmethods.scrolling();
//		
//		membership.student(locator_values.studentbutton);
//		//membership.alermsg();
//		membership.totalmebprice(locator_values.totalmbrprice);
//		membership.join(locator_values.joinnowbtn);
//		Thread.sleep(4000);
//		shoppingcart.fetchtotalprice(locator_values.ordertotal);
//		shoppingcart.createaccount(locator_values.creataccount);
//		
//		addressbook.firstname(locator_values.firstname,constantvalues.firstname);
//		addressbook.lastname(locator_values.lastname, constantvalues.lastname);
//		addressbook.username(locator_values.username, constantvalues.username);
//		addressbook.password(locator_values.password, constantvalues.password);
//		addressbook.cnfrmpassword(locator_values.cnfrmpassword, constantvalues.cofrmpassword);
//		addressbook.email(locator_values.email, constantvalues.email);
//		addressbook.company(locator_values.company, constantvalues.company);
//		addressbook.streetname(locator_values.street, constantvalues.streetName);
//		addressbook.country(locator_values.country, constantvalues.country);
//		addressbook.state(locator_values.state, constantvalues.state);
//		addressbook.city(locator_values.city, constantvalues.cityName);
//		addressbook.username(locator_values.zipcode, constantvalues.zipCode);
//		addressbook.username(locator_values.phone, constantvalues.phone);
		
	

}
}
