package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InterviewCode {
	public static WebDriver driver;
	public static WebDriver browserName(String bName) {
		if (bName.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			//driver=new ChromeDriver();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
		}
		else if (bName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			//driver=new FirefoxDriver();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
		return driver;
}
	public static void main(String[] args) {
		browserName("firefox");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("abc");;
		
	}
}