package constantValues;

import utilities.excelData;

public class constantvalues {
	public static String chromepath="D:\\selenium\\chromedriver_win32\\chromedriver.exe";
	public static String firfoxpath="D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe";
	public static final String excelpath="C:\\Users\\Sureet\\eclipse-workspace\\com.seleniumcertification.com\\src\\utilities\\excel_data.xlsx";
	public static String evidencesfolder="C:\\Users\\Sureet\\eclipse-workspace\\com.seleniumcertification.com\\src\\utilities\\evidences\\";
	public static String testbrowser="chrome";
	public static String URL="https://www.edureka.co/";

	
	public static final String testscenariosheetname = "TestScenario";
	public static final int runModeclm = 2;
	public static final int status = 3;
	public static final String emailID=excelData.readvalues("TestData", 10, 3);
	public static final String password=excelData.readvalues("TestData", 11, 3); 
	public static final String searchString=excelData.readvalues("TestData", 16, 3);
}

