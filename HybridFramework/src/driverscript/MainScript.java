package driverscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import constantvalues.Constantvalues;
import testcases.TC001;
import testcases.TC002;
import testcases.TC003;
import utilities.Log;
import utilities.Readwrite;

public class MainScript {
		  
		public static boolean bValue = true;
		
		@BeforeMethod
		public static void prerequiste() throws Exception {
			Readwrite.setexcelpath(Constantvalues.excelpath);
			DOMConfigurator.configure("log4j.xml");
		}
		
//--------------------------------------TC001------------------------------------------------		
		@Test(priority=1)
		public static void tc001() throws Exception {	
		if (Readwrite.readvalues(Constantvalues.testscenariosheetname, 1, Constantvalues.runModeclm).equalsIgnoreCase("y")) {
				bValue = true;
				Log.starttestcase("TC001");
				TC001.tc001();
				Log.endtestcase();
				if (bValue == false) {
					Readwrite.writeinexcel(Constantvalues.testscenariosheetname, 1, Constantvalues.status, "FAIL");
				} else {
					Readwrite.writeinexcel(Constantvalues.testscenariosheetname, 1, Constantvalues.status, "PASS");
				}
			} else {
				System.out.println("Skip execution tc001");
				Readwrite.writeinexcel(Constantvalues.testscenariosheetname, 1, Constantvalues.status, "SKIP");
			}
		}
//--------------------------------------TC002------------------------------------------------
		@Test(priority=2)
		public static void tc002() throws Exception {		
		if (Readwrite.readvalues(Constantvalues.testscenariosheetname, 2, Constantvalues.runModeclm).equalsIgnoreCase("y")) {
				bValue = true;
				Log.starttestcase("TC002");
				TC002.tc002();	
				Log.endtestcase();
				if (bValue == false) {
					Readwrite.writeinexcel(Constantvalues.testscenariosheetname, 2, Constantvalues.status, "FAIL");
				} else {
					Readwrite.writeinexcel(Constantvalues.testscenariosheetname, 2, Constantvalues.status, "PASS");
				}
			}
			else {
				System.out.println("Skip execution tc002");
				Readwrite.writeinexcel(Constantvalues.testscenariosheetname, 2, Constantvalues.status, "SKIP");
			}
		}	
//--------------------------------------TC003------------------------------------------------		
		@Test(priority=3)
		public static void tc003() throws Exception {
		if (Readwrite.readvalues(Constantvalues.testscenariosheetname, 3, Constantvalues.runModeclm).equalsIgnoreCase("y")) {
				bValue = true;
				Log.starttestcase("TC003");
				TC003.tc003();
				Log.endtestcase();
				if (bValue == false) {
					Readwrite.writeinexcel(Constantvalues.testscenariosheetname, 3, Constantvalues.status, "FAIL");
				} else {
					Readwrite.writeinexcel(Constantvalues.testscenariosheetname, 3, Constantvalues.status, "PASS");
				}
			}
			else {
				System.out.println("Skip execution tc003");
				Readwrite.writeinexcel(Constantvalues.testscenariosheetname, 3, Constantvalues.status, "SKIP");
			}
		}
	}	
