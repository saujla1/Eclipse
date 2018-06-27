package constantValues;

import utilities.readexcel;

public class constantvalues {
	public static String chromepath="D:\\selenium\\chromedriver_win32\\chromedriver.exe";
	public static String firfoxpath="D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe";
	public static final String excelpath="D:\\Eclipse\\DataDriverFramework2\\src\\utilities\\test_data.xlsx";
	public static String evidencesfolder="D:\\Eclipse\\DataDriverFramework2\\src\\utilities\\evidences";
	
	
	public static final String testscenariosheetname="TestScenario";
	public static final int runmodeclm=2;
	public static final int status=3;
	public static final String browserName=readexcel.readValues("TestData", 1, 3);
	public static final String url=readexcel.readValues("TestData", 2, 3);
	public static final String firstname=readexcel.readValues("TestData", 10, 3);
	public static final String lastname=readexcel.readValues("TestData", 11, 3);
	public static final String username=readexcel.readValues("TestData", 12, 3);
	public static final String password=readexcel.readValues("TestData", 13, 3);
	public static final String cofrmpassword=readexcel.readValues("TestData", 14, 3);
	public static final String email=readexcel.readValues("TestData", 15, 3);
	public static final String company=readexcel.readValues("TestData", 16, 3);
	public static final String streetName=readexcel.readValues("TestData", 17, 3);
	public static final String cityName=readexcel.readValues("TestData", 18, 3);
	public static final String country=readexcel.readValues("TestData", 21, 3);
	public static final String state=readexcel.readValues("TestData", 22, 3);
	public static final String zipCode=readexcel.readValues("TestData", 19, 3);
	public static final String phone=readexcel.readValues("TestData", 20, 3);
			
}
