package constantvalues;

import utilities.Readwrite;

public class Constantvalues {

	public static String chomepath = "C:\\Automation\\chromedriver_win32\\chromedriver.exe";
	public static String firefoxpath = "C:\\Automation\\geckodriver-v0.19.1-win64\\geckodriver.exe";
	public static final String excelpath = "C:\\26MayWeekEnd\\DatadrivenFramework\\Test.xlsx";
//	public static String testBrowser = "chrome";
//	public static String url ="https://www.aapc.com/";
//	public static String firstName = "Test";
//	public static String lastName = "Edureka";
//	public static String username = "Testuser1";
//	public static String password = "Test@1234";
//	public static String confirmPassword = "Test@1234";
//	public static String emailID = "testuser1234@test.com";
//	public static String companyName = "Edureka";
//	public static String streetName = "Test street";
//	public static String cityName = "Salt lake city";
//	public static String countryName = "United States";
//	public static String stateName = "UT";
//	public static String zipcode = "84120";
//	public static String phoneNumber = "123456789";

	
	public static final String testBrowser = Readwrite.readvalues("TestData", 1, 3);
	public static final String url = Readwrite.readvalues("TestData", 2, 3);
	public static final String firstName = Readwrite.readvalues("TestData", 10, 3);
	public static final String lastName = Readwrite.readvalues("TestData", 11, 3);
	public static final String username = Readwrite.readvalues("TestData", 12, 3);
	public static final String password = Readwrite.readvalues("TestData", 13, 3);
	public static final String confirmPassword = Readwrite.readvalues("TestData", 14, 3);
	public static final String emailID = Readwrite.readvalues("TestData", 15, 3);
	public static final String companyName = Readwrite.readvalues("TestData", 16, 3);
	public static final String streetName = Readwrite.readvalues("TestData", 17, 3);
	public static final String cityName = Readwrite.readvalues("TestData", 18, 3);
	public static final String countryName = Readwrite.readvalues("TestData", 21, 3);
	public static final String stateName = Readwrite.readvalues("TestData", 22, 3);
	public static final String zipcode = Readwrite.readvalues("TestData", 19, 3);
	public static final String phoneNumber = Readwrite.readvalues("TestData", 20, 3);
	
}
