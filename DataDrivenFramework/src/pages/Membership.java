package pages;



import commonMthods.ActionKeywords;


public class Membership {
	public static String cartVal(String valuefromlocclass) {
		String cartv=ActionKeywords.fetchValue(valuefromlocclass);
		System.out.println(cartv);
		return cartv;
		
		
	}
	public static void JoinNowBtn(String valuefromlocclass) {
		ActionKeywords.handling_clicks(valuefromlocclass);
		
	}
	
}
