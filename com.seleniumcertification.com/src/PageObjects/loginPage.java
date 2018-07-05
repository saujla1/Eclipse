package PageObjects;

import commonMethods.ActionKeywords;
import constantValues.constantvalues;
import utilities.locator_values;

public class loginPage {

	public static void loginBtn(String valuefromlocatorclass) throws Exception {
		ActionKeywords.handling_btn_cliks(valuefromlocatorclass);
		
	}
	
	public static void email(String valuefromlocatorclass, String testdata) {
		ActionKeywords.handling_text_boxes(valuefromlocatorclass, testdata);
		
	}
	
	public static void password(String valuefromlocatorclass, String testdata) {
		ActionKeywords.handling_text_boxes(valuefromlocatorclass, testdata);
	}
	
	public static void login(String valuefromlocatorclass) throws Exception {
		ActionKeywords.handling_btn_cliks(valuefromlocatorclass);
	}
	//scroll to bottom of page
	
	public static void scrolling() throws Exception {
		ActionKeywords.scrolling();
		
	}
	//click on blog link
	public static void bloglink(String valuefromlocatorclass) throws Exception {
		ActionKeywords.handling_btn_cliks(locator_values.blog);
	}
	public static void searchboxtext(String valuefromlocatorclass) {
		ActionKeywords.handling_text_boxes(locator_values.searchtextbox, constantvalues.searchString);
		
	}
	public static void clicksearchlink(String valuefromlocatorclass) throws Exception {
		ActionKeywords.handling_btn_cliks(locator_values.searchlink);
	}
	public static void interviewTab(String valuefromlocatorclass) throws Exception {
		ActionKeywords.handling_btn_cliks(valuefromlocatorclass);
		
	}
	
	//close tab function
}
