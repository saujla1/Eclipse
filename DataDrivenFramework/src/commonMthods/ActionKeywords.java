package commonMthods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import constantvalues.constantvalues;

import utilities.Locator_splittedvalues;


public class ActionKeywords {
	public static WebDriver driver;
	public static WebDriver browserName(String bName) {
		if (bName.equalsIgnoreCase("chrome")) {
			
	System.setProperty("webdriver.chrome.driver", constantvalues.chromepath);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	
	
		}
		else if (bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", constantvalues.firepath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
		}
	return driver;
	}
	public static void openurl(String testdata) {
		driver.get(testdata);
	}
	
	public static void mousehovering_withoutClick(String valuefromlocclass) {
		WebElement element=driver.findElement(Locator_splittedvalues.locatorsplitvalues(valuefromlocclass));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	public static void mousehovering_withClick(String valuefromlocclass) {
		WebElement element=driver.findElement(Locator_splittedvalues.locatorsplitvalues(valuefromlocclass));
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}
	public static String fetchValue(String valuefromlocclass) {
		
		String element=driver.findElement(Locator_splittedvalues.locatorsplitvalues(valuefromlocclass)).getText();
		return element;
		
	}
	public static void handling_textbox(String valuefromlocclass, String testdata) {
		WebElement element=driver.findElement(Locator_splittedvalues.locatorsplitvalues(valuefromlocclass));
		element.sendKeys(testdata);
	}
	public static void handling_clicks(String valuefromlocclass) {
		WebElement element=driver.findElement(Locator_splittedvalues.locatorsplitvalues(valuefromlocclass));
		element.click();
	}
	public static void handling_dropdown(String valuefromlocclass, String testdata) {
		WebElement element=driver.findElement(Locator_splittedvalues.locatorsplitvalues(valuefromlocclass));
		Select selselect =new Select(element);
		selselect.selectByVisibleText(testdata);
		
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void scrolling() {
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,400)");
		
	}
}

