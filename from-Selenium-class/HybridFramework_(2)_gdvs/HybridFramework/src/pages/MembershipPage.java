package pages;

import commonMthods.ActionKeywords;

public class MembershipPage {
	
	public static String cartVal(String valuefrmlocclass) throws Exception {
		String cartValue = ActionKeywords.fetchValues(valuefrmlocclass);
		System.out.println(cartValue);
		return cartValue;
	}
	
	public static void joinNowbtn(String valuefrmlocclass) throws Exception {
		ActionKeywords.handling_clicks(valuefrmlocclass);
	}
}
