package locatorPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class addingWait {
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.edureka.co");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	public void searchCourse() {
		try {
			driver.findElement(By.id("homeSearchBar")).sendKeys("java");
			Thread.sleep(3000);
			driver.findElement(By.id("homeSearchBarIcon")).click();
			jse=(JavascriptExecutor)(driver);
			jse.executeScript("scroll(0,1000");
			//driver.findElement(By.cssSelector("a[href='/java-j2ee-soa-training']")).click();
			//driver.findElement(By.linkText("Java, Java EE & SOA Certification Training")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addingWait myObj=new addingWait();
		myObj.invokeBrowser();
		myObj.searchCourse();
		

	}

}
