package commonMthods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import constantvalues.Constantvalues;
import driverscript.MainScript;
import utilities.Locator_Splittedvalues;
import utilities.Log;
import utilities.Screenshots;

public class ActionKeywords {
	
	 public static WebDriver driver;
	  
	  public static WebDriver selectBrowser(String brsName) throws Exception {
		try {
			if (brsName.equalsIgnoreCase("chrome")) {
				  System.setProperty("webdriver.chrome.driver", Constantvalues.chomepath);
				 driver = new ChromeDriver();
				 driver.manage().window().maximize();	
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 Log.info("Successfully opened the browser");
			} else if (brsName.equalsIgnoreCase("firefox")) {
				 System.setProperty("webdriver.gecko.driver", Constantvalues.firefoxpath);
	             driver = new FirefoxDriver();
	             Log.info("Successfully opened the browser");
			} else {
				Log.error("Not able to open the browser");
				System.out.println("Browser name is wrong");
			}	
		} catch (Exception e) {
			Screenshots.takingscreensht((TakesScreenshot) driver, brsName);
			MainScript.bValue = false;
			System.out.println("Not able to open the browser");
			e.printStackTrace();
		}
		
		return driver;
	  }
	  
	  public static void openURL(String testdata) throws Exception {
		  try {
			  driver.get(testdata);			
			  Log.info("Successfully opened the website" + testdata);
		} catch (Exception e) {
			Log.error("Not able to open the website" + testdata);
			Screenshots.takingscreensht((TakesScreenshot) driver, "Website");
			MainScript.bValue = false;
			System.out.println("Website not opened");
			e.printStackTrace();
		}

	  }
	  
	  public static void mousehovering_withoutclick(String valuefrmlocclass) throws Exception {
			try {
			  	WebElement element = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass));
				Actions act = new Actions(driver);
				act.moveToElement(element).build().perform();			
				Log.info("mousehovering_withoutclick executed successfully on " + valuefrmlocclass);
			} catch (Exception e) {
				Log.error("mousehovering_withoutclick did not execute successfully on " + valuefrmlocclass);
				Screenshots.takingscreensht((TakesScreenshot) driver, "mousehovering_withoutclick");
				MainScript.bValue = false;
				System.out.println("mouse hovering without click did not work");
				e.printStackTrace();
			}

	  }

	  public static void mousehovering_withClick(String valuefrmlocclass) throws Exception {
			try {
			  	WebElement element = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass));
				Actions act = new Actions(driver);
				act.moveToElement(element).click().build().perform();		  			
				Log.info("mousehovering_withClick executed successfully on" + valuefrmlocclass);
			} catch (Exception e) {
				Log.error("mousehovering_withClick did not execute successfully on" + valuefrmlocclass);
				Screenshots.takingscreensht((TakesScreenshot) driver, "mousehovering_withClick");
				MainScript.bValue = false;
				System.out.println("Mouse hovering with click did not work");
				e.printStackTrace();
			}

	  }
	  
	  public static String fetchValues(String valuefrmlocclass) throws Exception {
		  try {
			  String element = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass)).getText();
			  Log.info("fetchValues executed successfully on" + valuefrmlocclass);
			  return element;					  
		} catch (Exception e) {
			Log.error("fetchValues did not execute successfully on" + valuefrmlocclass);
			Screenshots.takingscreensht((TakesScreenshot) driver, "fetchValues");
			MainScript.bValue = false;
			System.out.println("Not able to fetch the value from webelement");
			e.printStackTrace();
		}
		  return null;
	  }
	  
	  public static void handling_textbox(String valuefrmlocclass, String testdata) throws Exception {
		  try {
			  WebElement element = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass));
			  element.sendKeys(testdata);			
			  Log.info("handling_textbox executed successfully on" + valuefrmlocclass);
		} catch (Exception e) {
			Log.error("handling_textbox did not execute successfully on" + valuefrmlocclass);
			Screenshots.takingscreensht((TakesScreenshot) driver, "handling_textbox");
			MainScript.bValue = false;
			System.out.println("Not able to enter text in the text box");
			e.printStackTrace();
		}

	  }
	  
	  public static void handling_clicks(String valuefrmlocclass) throws Exception {
		  try {
			  WebElement element = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass));
			  element.click();			
			  Log.info("handling_clicks executed successfully on" + valuefrmlocclass);
		} catch (Exception e) {
			Log.error("handling_clicks did not execute successfully on" + valuefrmlocclass);
			Screenshots.takingscreensht((TakesScreenshot) driver, "handling_clicks");
			MainScript.bValue = false;
			System.out.println("NOt able to click on the webelement");
			e.printStackTrace();
		}
		  
	  }
	  
	  public static void handling_dropdowns(String valuefrmlocclass, String testdata) throws Exception {
			try {
				WebElement enterState = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass));
				Select selstate = new Select(enterState);
				selstate.selectByVisibleText(testdata);	
				Log.info("handling_dropdowns executed successfully on" + valuefrmlocclass);
			} catch (Exception e) {
				Log.error("handling_dropdowns did not execute successfully on" + valuefrmlocclass);
				Screenshots.takingscreensht((TakesScreenshot) driver, "handling_dropdowns");
				MainScript.bValue = false;
				System.out.println("Not able to select value from drop downs");
				e.printStackTrace();
			}
			
	  }
	  
	  public static void closeBrowser() throws Exception {
		  try {
			  driver.close();
			  Log.info("Successfully Closed the browser");
		} catch (Exception e) {
			Log.error("Not able to close the browser");
			Screenshots.takingscreensht((TakesScreenshot) driver, "closeBrowser");
			MainScript.bValue = false;
			System.out.println("Not able to close the browser");
			e.printStackTrace();
		}
		  
	  }
	  
	  public static void scrolling() throws Exception {
		  try {
			  JavascriptExecutor jse = (JavascriptExecutor) driver;
			  jse.executeScript("scroll(0,400)");			
			  Log.info("Successfully executed the scrolling");
		} catch (Exception e) {
			Log.error("Not able to execute the scrolling");
			Screenshots.takingscreensht((TakesScreenshot) driver, "scrolling");
			MainScript.bValue = false;
			e.printStackTrace();
		}

	  }

}
