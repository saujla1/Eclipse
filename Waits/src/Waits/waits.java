package Waits;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class waits {
	public static WebDriver driver;
	public static WebDriver browserName(String bName) {
		if (bName.equalsIgnoreCase("chrome")) {
			
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	
	
	
		}
		else if (bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
		}
	return driver;
	}
	
	public static void main(String[] args) throws InterruptedException {
		browserName("chrome");
		
		//working with pop ups-alert message.
		
		//driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("scroll(0,600)");
		//driver.findElement(By.xpath("//*[@id=\"content\"]/p[8]/button")).click();
		//Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		//Working with iframes
		
		driver.manage().window().maximize();
//		driver.get("http://toolsqa.com/iframe-practice-page/");
//		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
//		jse1.executeScript("scroll(0,400)");
//		Thread.sleep(3000);
//		
//		driver.switchTo().frame("IF2"); //"IF2 is the frame ID"
//		
//		Thread.sleep(3000);
//		
//		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
//		jse2.executeScript("scroll(0,1000)");
//		driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]")).click();
//		driver.switchTo().defaultContent();
//		String name=driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
//		System.out.println(name);
		
		// Switch to a different windows- working with multiple windows
		
//		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button")).click();
//		List<String> allWindowIDS= new ArrayList<String>(driver.getWindowHandles());
//		System.out.println(allWindowIDS.get(0));
//		System.out.println(allWindowIDS.get(1));
//		
//		driver.switchTo().window(allWindowIDS.get(1));
//		driver.findElement(By.xpath("//*[@id=\"trigger-overlay\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/nav/div/div/form/input[1]")).sendKeys("Selenium");
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/nav/div/div/form/input[1]")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		driver.close();
//		
//		driver.switchTo().window(allWindowIDS.get(0));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"trigger-overlay\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/nav/div/div/form/input[1]")).sendKeys("Selenium");
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/nav/div/div/form/input[1]")).sendKeys(Keys.ENTER);
//		driver.quit();
		
		//Working with tables. Static and Dynamic tables
		
//		driver.get("http://toolsqa.com/automation-practice-table/");
//		List<WebElement> totalNoOfRows=driver.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr"));
//		int noOfRows=totalNoOfRows.size();
//		System.out.println(noOfRows);
//		
//		for (int i = 0; i < noOfRows; i++) {
//			List<WebElement> tabledata=new ArrayList<WebElement>(totalNoOfRows.get(i).findElements(By.tagName("td")));
//			int sizeOfTableColumn=tabledata.size();
//			System.out.println("Size of column: "+ sizeOfTableColumn);
//			
//			for (int j = 0; j < sizeOfTableColumn; j++) {
//				
//				String tdValues=tabledata.get(j).getText();
//				System.out.println(tdValues);
//			}
			
		//Actions- mouse hovering
//		driver.get("http://toolsqa.com/");
//		WebElement menu= driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[8]/a/span[1]/span/span"));
//		Actions act= new Actions(driver);
//		act.moveToElement(menu).build().perform();
//		WebDriverWait wait= new WebDriverWait(driver, 20);
//		
//		WebElement submenu=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[8]/ul/li[3]/a/span[1]/span/span"))));
//		
//		act.moveToElement(submenu).click().build().perform();
//		
//		radio button
		driver.get("https://www.facebook.com/");
		WebElement maleradiobtn= driver.findElement(By.id("u_0_a"));
		boolean bvalue_maleradiobtn=maleradiobtn.isSelected();
		System.out.println(bvalue_maleradiobtn);
		maleradiobtn.click();
		boolean bvalue_maleradiobtn_click= maleradiobtn.isSelected();
		System.out.println(bvalue_maleradiobtn_click);
		
		//element is displayed
		WebElement reenteremail=driver.findElement(By.name("reg_email_confirmation__"));
		boolean bvalue_reenteremail=reenteremail.isDisplayed();
		System.out.println(bvalue_reenteremail);

		driver.findElement(By.name("reg_email__")).sendKeys("abc@ab.com");
		boolean bvalue_reenteremail_afterEnabling=reenteremail.isDisplayed();
		System.out.println(bvalue_reenteremail_afterEnabling);
		
		
		}
		
	
		
		
		
		
		

	}


