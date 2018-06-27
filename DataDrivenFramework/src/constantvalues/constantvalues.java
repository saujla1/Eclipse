package constantvalues;

import utilities.ReadExcel;

public class constantvalues {

	public static String chromepath="D:\\selenium\\chromedriver_win32\\chromedriver.exe";
	public static String firepath="D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe";
	public static final String excelpath="D:\\Eclipse\\DataDrivenFramework\\src\\utilities\\test_data.xlsx";
	
//	public static String browserName="chrome";
//	public static String url="https://www.aapc.com/";
//	public static String firstname="abc";
//	public static String lastname="def";
//	public static String username="ghijk";
//	public static String password="Forqapassword1";
//	public static String cofrmpassword="Forqapassword1";
//	public static String email="abc@yahoo.com";
//	public static String company="abc";
//	public static String streetName="abc";
//	public static String cityName="unknown";
//	public static String zipCode="98765";
//	public static String phone="5109998888";
	
	//final keyword is used so that value cannot be changed at runtime. In this case
	//values in excel sheet cannot be changed while the program is executing.
	public static final String browserName=ReadExcel.readvalues("TestData", 1, 3);
	public static final String url=ReadExcel.readvalues("TestData", 2, 3);
	public static final String firstname=ReadExcel.readvalues("TestData", 10, 3);
	public static final String lastname=ReadExcel.readvalues("TestData", 11, 3);
	public static final String username=ReadExcel.readvalues("TestData", 12, 3);
	public static final String password=ReadExcel.readvalues("TestData", 13, 3);
	public static final String cofrmpassword=ReadExcel.readvalues("TestData", 14, 3);
	public static final String email=ReadExcel.readvalues("TestData", 15, 3);
	public static final String company=ReadExcel.readvalues("TestData", 16, 3);
	public static final String streetName=ReadExcel.readvalues("TestData", 17, 3);
	public static final String cityName=ReadExcel.readvalues("TestData", 18, 3);
	public static final String country=ReadExcel.readvalues("TestData", 21, 3);
	public static final String state=ReadExcel.readvalues("TestData", 22, 3);
	public static final String zipCode=ReadExcel.readvalues("TestData", 19, 3);
	public static final String phone=ReadExcel.readvalues("TestData", 20, 3);
	
	

}
