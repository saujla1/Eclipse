package commonmethods;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import constantvalues.constvalues;
import data.locatorsplit;

public class commonmethods {
	public static WebDriver driver;
	public static WebDriver browsername(String bname) {
		if (bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", constvalues.chromepath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
		
	}
	public static void openurl(String testdata) {
		driver.get(testdata);
	}
	
	public static void handling_clicks(String valuefromlocclass) {
		WebElement element=driver.findElement(locatorsplit.splitvalues(valuefromlocclass));
		System.out.println("this is a test");
		element.click();
	}
	
	public static void handling_table(String valuefromlocclass) {
		WebElement element=driver.findElement(locatorsplit.splitvalues(valuefromlocclass));
		//List<WebElement> noofrows=driver.findElements(locatorsplit.splitvalues(valuefromlocclass));
		//List<WebElement> noofrows=driver.findElements(By.xpath("//*[@id=\"htmlTableId\"]/tbody/tr"));
		//int sizeofrows=noofrows.size();
		element.click();
		System.out.println(element.getText());
		//getting the header
//		List<WebElement> header=noofrows.get(0).findElements(locatorsplit.splitvalues(valuefromlocclass1));
//		int sizeofheader=header.size();
//		for (int i = 0; i < sizeofheader; i++) {
//			String head=header.get(i).getText();
//			System.out.print(head+"\t");
//		}
//		System.out.println();
//		for (int i = 1; i < sizeofrows; i++) {
//			List<WebElement> noofcolumns=noofrows.get(i).findElements(locatorsplit.splitvalues(valuefromlocclass2));
//			int sizeofeachcolumn=noofcolumns.size();
//			for (int j = 0; j < sizeofeachcolumn; j++) {
//				String tabledata=noofcolumns.get(j).getText();
//			System.out.println(tabledata + "\t");
//			}
			
		//}
		
		
	}
}
	