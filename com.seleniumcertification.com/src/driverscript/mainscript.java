package driverscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constantValues.constantvalues;
import testCases.TCOO2;
import utilities.excelData;
import utilities.log;

public class mainscript {
	public static boolean bValue= true;
	
	@BeforeMethod
	public static void prerequiste() throws Exception {
		excelData.setExvelPath(constantvalues.excelpath);
		DOMConfigurator.configure("log4j.xml");
		
	}
	@Test(priority=1)			
	public static void tc002() throws Exception {
		
		//**************************TC002************************************
		
		if(excelData.readvalues(constantvalues.testscenariosheetname, 2, constantvalues.runModeclm).equalsIgnoreCase("y")){
			bValue=true;
			log.statCase("TC002");
			TCOO2.tc002();
			log.endCase();
			if (bValue=false) {
				excelData.writevalues(constantvalues.testscenariosheetname, 2, constantvalues.status, "FAIL");
				
			}
			else {
				excelData.writevalues(constantvalues.testscenariosheetname, 2, constantvalues.status , "PASS");
			}
		}
		else {
			System.out.println("Skip execution TC001");
			excelData.writevalues(constantvalues.testscenariosheetname, 2, constantvalues.status, "SKIP");
			
		}
		 

	}
	//***********************************************************
}


