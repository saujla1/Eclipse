package pages;

import commonMthods.ActionKeywords;

public class MembershipPage {
	
	public static String cartVal(String valuefrmlocclass) {
		String cartValue = ActionKeywords.fetchValues(valuefrmlocclass);
		System.out.println(cartValue);
		return cartValue;
	}
	
	public static void joinNowbtn(String valuefrmlocclass) {
		ActionKeywords.handling_clicks(valuefrmlocclass);
	}
}
