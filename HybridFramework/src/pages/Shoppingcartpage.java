package pages;

import commonMthods.ActionKeywords;

public class Shoppingcartpage {
	
	public static String totalpriceshpngcart(String valuefrmlocclass) throws Exception {
	String totalPriceshoppingcart = ActionKeywords.fetchValues(valuefrmlocclass);
	System.out.println(totalPriceshoppingcart);
	return totalPriceshoppingcart;
	}
	
	public static void createaccnt(String valuefrmlocclass) throws Exception {
		ActionKeywords.handling_clicks(valuefrmlocclass);	
	}
}
