package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Module3 {
	public static WebDriver driver;
	public static WebDriver browserName(String bName) {
		if (bName.equalsIgnoreCase("chrome")) {
			
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	
		}
		else if (bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
												
		}
	return driver;
	}
	public static void main(String[] args) {
		browserName("chrome");
		driver.get("https://www.edureka.co/");
		driver.findElement(By.id("homeSearchBar")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"homeSearchBarIcon\"]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement seleniumCourse= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"course-box-535\"]/div/div[1]/div[3]/div[1]/h3/a"))));
		seleniumCourse.click();
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		
		driver.navigate().back();
		
		
		WebElement Courses=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"dropdownMenu1\"]"))));
		Courses.click();
		WebElement AllCourses=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"load_allcourses\"]/a"))));
		AllCourses.click();
	}

}
