package pages;

import commonMethods.commonmethods;

public class membership {
	public static void student(String valuefromlocatorclass) throws Exception {
		//radio button
		commonmethods.handling_radiobtn(valuefromlocatorclass);
	}
	public static void alermsg() throws Exception {
		commonmethods.alerbox();
	}
	
	public static void totalmebprice(String valuefromlocatorclass) throws Exception {
		commonmethods.fetchvalue(valuefromlocatorclass);
	}
	public static void join(String valuefromlocatorclass) throws Exception {
		commonmethods.handling_clicks(valuefromlocatorclass);
	}
	
	
}
