package commonMethods;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import constantValues.constantvalues;
import driverscript.mainscript;
import utilities.locatorvalues_split;
import utilities.log;
import utilities.screenshots;

public class commonmethods {
	
	public static WebDriver driver;
	public static WebDriver browserName(String bName) throws Exception {
		try {
			if (bName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", constantvalues.chromepath);
				driver=new ChromeDriver();
				log.info("Successfully opened the browser");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			}
			else if(bName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.com", constantvalues.firfoxpath);
				driver=new FirefoxDriver();
				log.info("Successfully opened the browser");
				driver.manage().window().maximize();
				
			}
			else {
				System.out.println("Browser not found");
			}
			
			
		} catch (Exception e) {
			log.error("Unable to open browser");
			screenshots.takingscreensht((TakesScreenshot) driver, bName);
			mainscript.bValue=false;
			System.out.println("Not able to open the browser");
			e.printStackTrace();
		}
		return driver;
		
	}
	public static void openUrl(String testdata) throws Exception {
		try {
			driver.get(testdata);
			log.info("Successfully opened URL");
		} catch (Exception e) {
			log.error("Unable to open URL");
			screenshots.takingscreensht((TakesScreenshot) driver, "Website");
			mainscript.bValue=false;
			System.out.println("URL cannot be opened");
			e.printStackTrace();
		}
		
	}
	
	public static void mousehovering_withoutclick(String valuefromlocatorclass) throws Exception {
		try {
			WebElement element=driver.findElement(locatorvalues_split.locatorvaluessplit(valuefromlocatorclass));
			Actions act= new Actions(driver);
			act.moveToElement(element).build().perform();
			log.info("mousehovering_withoutclick executed succsessfully on"+ valuefromlocatorclass);
		} catch (Exception e) {
			log.error("mousehovering_withoutclick did not executed succsessfully on"+  valuefromlocatorclass);
			screenshots.takingscreensht((TakesScreenshot) driver, "mousehovering_withoutclick");
			mainscript.bValue=false;
			System.out.println("Mouse hovering without click did not work");
			e.printStackTrace();
		}
		
	}
	
	public static void mousehovering_withclick(String valuefromlocatorclass) throws Exception {
		try {
			WebElement element=driver.findElement(locatorvalues_split.locatorvaluessplit(valuefromlocatorclass));
			Actions act=new Actions(driver);
			act.moveToElement(element).click().build().perform();
			log.info("mousehovering_withclick executed succsessfully on"+ valuefromlocatorclass);
		} catch (Exception e) {
			log.error(("mousehovering_withclick did not execute succsessfully on"+ valuefromlocatorclass));
			screenshots.takingscreensht((TakesScreenshot) driver, "mousehovering_withclick");
			mainscript.bValue=false;
			System.out.println("Mouse hovering with click did not work");
			e.printStackTrace();
		}
		
	}
	
	public static void handling_radiobtn(String valuefromlocatorclass) throws Exception {
		try {
			WebElement element = driver.findElement(locatorvalues_split.locatorvaluessplit(valuefromlocatorclass));
			
			boolean bvalue_maleradiobtn=element.isSelected();
			if (bvalue_maleradiobtn==false) {
				element.click();
				log.info("handling_radiobtn executed succsessfully on"+ valuefromlocatorclass);
			}
		} catch (Exception e) {
			log.error("handling_radiobtn not executed succsessfully on"+ valuefromlocatorclass);
			screenshots.takingscreensht((TakesScreenshot) driver, "handling_radiobtn");
			mainscript.bValue=false;
			System.out.println("Not able to find radio button");
			e.printStackTrace();
		}

		
		
	}
	
	public static String fetchvalue(String valuefromlocatorclass) throws Exception {
		try {
			String element=driver.findElement(locatorvalues_split.locatorvaluessplit(valuefromlocatorclass)).getText();
			System.out.println(element);
			log.info("fetchvalue executed succsessfully on"+ valuefromlocatorclass);
			return element;
			
		} catch (Exception e) {
			log.error("fetchvalue not executed succsessfully on"+ valuefromlocatorclass);
			screenshots.takingscreensht((TakesScreenshot) driver, "fetchvalue");
			mainscript.bValue=false;
			System.out.println("Not able to fetch value");
			e.printStackTrace();
		}
		
		return null;
				
	}
	
	public static void handling_text(String valuefromlocatorclass, String testdata) throws Exception {
		try {
			WebElement element=driver.findElement(locatorvalues_split.locatorvaluessplit(valuefromlocatorclass));
			element.sendKeys(testdata);
			log.info("handling_text executed succsessfully on"+ valuefromlocatorclass);
		} catch (Exception e) {
			log.error("handling_text not executed succsessfully on"+ valuefromlocatorclass);
			screenshots.takingscreensht((TakesScreenshot) driver, "handling_text");
			mainscript.bValue=false;
			System.out.println("Not able to enter text in the text field");
			e.printStackTrace();
		}
		
	}
	public static void handling_clicks(String valuefromlocatorclass) throws Exception {
		try {
			WebElement element=driver.findElement(locatorvalues_split.locatorvaluessplit(valuefromlocatorclass));
			element.click();
			log.info("handling_clicks executed succsessfully on"+ valuefromlocatorclass);
		} catch (Exception e) {
			log.error("handling_clicks not executed succsessfully on"+ valuefromlocatorclass);
			screenshots.takingscreensht((TakesScreenshot) driver, "handling_clicks");
			mainscript.bValue=false;
			System.out.println("Not able to click element");
			e.printStackTrace();
		}
		
	}
	public static void handling_dropdown(String valuefromlocatorclass, String testdata ) throws Exception {
		try {
			WebElement element=driver.findElement(locatorvalues_split.locatorvaluessplit(valuefromlocatorclass));
			Select sel=new Select(element);
			sel.selectByVisibleText(testdata);
			log.info("handling_dropdown executed succsessfully on"+ valuefromlocatorclass);
		} catch (Exception e) {
			log.error("handling_dropdown not executed succsessfully on"+ valuefromlocatorclass);
			screenshots.takingscreensht((TakesScreenshot) driver, "handling_dropdown");
			mainscript.bValue=false;
			System.out.println("Not able to select value from dropdown list");
			e.printStackTrace();
		}
		
		
	}
	public static void alerbox() throws Exception {
		try {
			driver.switchTo().alert().accept();
			log.info("alerbox executed succsessfully on");
		} catch (Exception e) {
			log.error("alerbox not executed succsessfully on");
			screenshots.takingscreensht((TakesScreenshot) driver, "alerbox");
			mainscript.bValue=false;
			System.out.println("Not able to see alert box");
			e.printStackTrace();
		}
		
	}
	public static void scrolling() throws Exception {
		try {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("scroll(0,400)");
			log.info("scrolling executed succsessfully");
		} catch (Exception e) {
			log.error("scrolling not executed succsessfully");
			screenshots.takingscreensht((TakesScreenshot) driver, "scrolling");
			mainscript.bValue=false;
			System.out.println("Not able to scroll");
			e.printStackTrace();
		}
		
	}
	
	public static void closeBrowser() throws Exception {
		try {
			driver.close();
			log.info("Browser closed successfully");
		} catch (Exception e) {
			log.error("Browser not closed successfully");
			screenshots.takingscreensht((TakesScreenshot) driver, "closeBrowser");
			mainscript.bValue=false;
			System.out.println("Browser cannot be closed");
			e.printStackTrace();
		}
		
	}
}



	
	