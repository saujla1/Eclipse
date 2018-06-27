package commonMthods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import constantvalues.Constantvalues;
import driverscript.MainScript;
import utilities.Locator_Splittedvalues;

public class ActionKeywords {
	
	 public static WebDriver driver;
	  
	  public static WebDriver selectBrowser(String brsName) {
		
		if (brsName.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver", Constantvalues.chomepath);
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();	
			 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		} else if (brsName.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver", Constantvalues.firefoxpath);
			  
			   driver = new FirefoxDriver();
		} else {
			System.out.println("Browser name is wrong");
		}
		return driver;
	  }
	  
	  public static void openURL(String testdata) {
		  driver.get(testdata);
	  }
	  
	  public static void mousehovering_withoutclick(String valuefrmlocclass) {
			WebElement element = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass));
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
	  }

	  public static void mousehovering_withClick(String valuefrmlocclass) {
			WebElement element = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass));
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();		  
	  }
	  
	  public static String fetchValues(String valuefrmlocclass) {
		  String element = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass)).getText();
		  return element;
	  }
	  
	  public static void handling_textbox(String valuefrmlocclass, String testdata) {
		  WebElement element = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass));
		  element.sendKeys(testdata);
	  }
	  
	  public static void handling_clicks(String valuefrmlocclass) {
		  WebElement element = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass));
		  element.click();;		  
	  }
	  
	  public static void handling_dropdowns(String valuefrmlocclass, String testdata) {
			WebElement enterState = driver.findElement(Locator_Splittedvalues.locatorsplitvalues(valuefrmlocclass));
			Select selstate = new Select(enterState);
			selstate.selectByVisibleText(testdata);
	  }
	  
	  public static void closeBrowser() {
		  driver.close();
	  }
	  
	  public static void scrolling() {
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("scroll(0,400)");
	  }

}
