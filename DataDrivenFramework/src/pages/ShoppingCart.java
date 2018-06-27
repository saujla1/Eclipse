package pages;



import commonMthods.ActionKeywords;

public class ShoppingCart {
	public static String OrderTotal(String valuefromlocclass) {
		
		String orderT=ActionKeywords.fetchValue(valuefromlocclass);
		System.out.println(orderT);
		return orderT;
	}
	
	public static void Login(String valuefromlocclass) {
		ActionKeywords.handling_clicks(valuefromlocclass);
		
	}
}

