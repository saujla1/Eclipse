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

import driverscript.mainscript;

import utilities.locator_values_split;
import utilities.log;
import utilities.screenshots;

public class ActionKeywords {
	public static WebDriver driver;
	public static WebDriver browserName(String bName) throws Exception {
		try{
		if (bName.equalsIgnoreCase("chrome")) {
			
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	log.info("Successfully opened the browser");
	
	
	
		}
		else if (bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			log.info("Successfully opened the browser");
			
												
		}
		else {
			log.error("Not able to open the browser");
			System.out.println("Browser name is wrong");
		}
		}
		catch(Exception e) {
			mainscript.bValue = false;
			System.out.println("Not able to open the browser");
			e.printStackTrace();
			
			
			
		}
	return driver;
	
	}
	
	public static void openURL(String testdata) throws Exception {
		try {
			driver.get(testdata);
			log.info("URL opened successfully");
		}
		catch(Exception e){
			log.error("Unable to open URL");
			screenshots.takingscreensht((TakesScreenshot)driver, "website");
			mainscript.bValue=false;
			e.printStackTrace();
		}
	}
	public static void handling_btn_cliks(String valuefromlocclass) throws Exception {
		try {
			WebElement element=driver.findElement(locator_values_split.locatorvaluessplit(valuefromlocclass));
			element.click();
			log.info("handling_text executed successfully on"+ valuefromlocclass);
		} catch (Exception e) {
			log.error("handling clicks executed successfully on" + valuefromlocclass);
			screenshots.takingscreensht((TakesScreenshot)driver, "handling_clicks");
			mainscript.bValue=false;
			e.printStackTrace();
		}
	}
	
	public static void handling_text_boxes(String valuefromlocclass, String testdata) {
		try {
			WebElement element =driver.findElement(locator_values_split.locatorvaluessplit(valuefromlocclass));
			element.sendKeys(testdata);
			log.info("text entered successfully on"+ valuefromlocclass);
		} catch (Exception e) {
			log.error("text NOT entered successfully on" + valuefromlocclass);
			mainscript.bValue=false;
			e.printStackTrace();
		}
		
		
	}
	public static void mousehovering_withoutclick(String valuefromlocclass) throws Exception {
		try {
			WebElement element=driver.findElement(locator_values_split.locatorvaluessplit(valuefromlocclass));
			Actions act= new Actions(driver);
			act.moveToElement(element).build().perform();
			log.info("mousehovering_withoutclick executed successfully on"+ valuefromlocclass);
		} catch (Exception e) {
			log.error("mousehovering_withoutclick did not executed successfully on"+  valuefromlocclass);
			screenshots.takingscreensht((TakesScreenshot) driver, "mousehovering_withoutclick");
			mainscript.bValue=false;
			System.out.println("Mouse hovering without click did not work");
			e.printStackTrace();
		}
		
	}
	
	public static void mousehovering_withclick(String valuefromlocclass) throws Exception {
		try {
			WebElement element=driver.findElement(locator_values_split.locatorvaluessplit(valuefromlocclass));
			Actions act=new Actions(driver);
			act.moveToElement(element).click().build().perform();
			log.info("mousehovering_withclick executed successfully on"+ valuefromlocclass);
		} catch (Exception e) {
			log.error(("mousehovering_withclick did not execute successfully on"+ valuefromlocclass));
			screenshots.takingscreensht((TakesScreenshot) driver, "mousehovering_withclick");
			mainscript.bValue=false;
			System.out.println("Mouse hovering with click did not work");
			e.printStackTrace();
		}
		
	}
	
	public static void handling_radiobtn(String valuefromlocclass) throws Exception {
		try {
			WebElement element = driver.findElement(locator_values_split.locatorvaluessplit(valuefromlocclass));
			
			boolean bvalue_maleradiobtn=element.isSelected();
			if (bvalue_maleradiobtn==false) {
				element.click();
				log.info("handling_radiobtn executed successfully on"+ valuefromlocclass);
			}
		} catch (Exception e) {
			log.error("handling_radiobtn not executed successfully on"+ valuefromlocclass);
			screenshots.takingscreensht((TakesScreenshot) driver, "handling_radiobtn");
			mainscript.bValue=false;
			System.out.println("Not able to find radio button");
			e.printStackTrace();
		}

		
		
	}
	
	public static String fetchvalue(String valuefromlocclass) throws Exception {
		try {
			String element=driver.findElement(locator_values_split.locatorvaluessplit(valuefromlocclass)).getText();
			System.out.println(element);
			log.info("fetchvalue executed successfully on"+ valuefromlocclass);
			return element;
			
		} catch (Exception e) {
			log.error("fetchvalue not executed successfully on"+ valuefromlocclass);
			screenshots.takingscreensht((TakesScreenshot) driver, "fetchvalue");
			mainscript.bValue=false;
			System.out.println("Not able to fetch value");
			e.printStackTrace();
		}
		
		return null;
				
	}
	public static void handling_dropdown(String valuefromlocclass, String testdata ) throws Exception {
		try {
			WebElement element=driver.findElement(locator_values_split.locatorvaluessplit(valuefromlocclass));
			Select sel=new Select(element);
			sel.selectByVisibleText(testdata);
			log.info("handling_dropdown executed successfully on"+ valuefromlocclass);
		} catch (Exception e) {
			log.error("handling_dropdown not executed successfully on"+ valuefromlocclass);
			screenshots.takingscreensht((TakesScreenshot) driver, "handling_dropdown");
			mainscript.bValue=false;
			System.out.println("Not able to select value from dropdown list");
			e.printStackTrace();
		}
		
		
	}
	public static void alerbox() throws Exception {
		try {
			driver.switchTo().alert().accept();
			log.info("alerbox executed successfully on");
		} catch (Exception e) {
			log.error("alerbox not executed successfully on");
			screenshots.takingscreensht((TakesScreenshot) driver, "alerbox");
			//mainscript.bValue=false;
			System.out.println("Not able to see alert box");
			e.printStackTrace();
		}
		
	}
	public static void scrolling() throws Exception {
		try {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("scroll(0,400)");
			log.info("scrolling executed successfully");
		} catch (Exception e) {
			log.error("scrolling not executed successfully");
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

