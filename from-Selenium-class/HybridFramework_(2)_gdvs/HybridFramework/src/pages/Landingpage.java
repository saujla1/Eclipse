package pages;

import commonMthods.ActionKeywords;

public class Landingpage {

	public static void mmbrshplnk(String valuefrmlocclass) throws Exception {
		ActionKeywords.mousehovering_withoutclick(valuefrmlocclass);
	}
	
	public static void individualLink(String valuefrmlocclass) throws Exception {
		ActionKeywords.mousehovering_withClick(valuefrmlocclass);
	}
}
