package Waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Module5 {
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
		//login
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pwd1")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div[4]/button")).click();
		WebDriverWait wait=new WebDriverWait(driver, 15);
		//click on user profile
		WebElement profile=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a/span"))));
		profile.click();
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[1]")).click();;
		driver.findElement(By.xpath("//*[@id=\"myprofile\"]/div[2]/div[1]/div/div[1]/h4[2]/span/i")).click();
		//select experience
		Select experience=new Select(driver.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[1]/div/div/div/div/select")));
		experience.selectByVisibleText("7-10 years");
		//select ctc
		Select ctc = new Select(driver.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[2]/div/div/div/div/select")));
		ctc.selectByVisibleText("Not applicable");
		
		//select relocate radio button
		driver.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[6]/div/div/div/div/label[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/div/div/div[2]/app-myprofile/div[2]/div/div/div[1]/div[2]/i")).click();
		
		//Upload resume file
		//driver.findElement(By.xpath("//input[@placeholder=\"Choose File\"]")).click();
		
		//select certification
		driver.findElement(By.xpath("//ul[@class='tabs']/li[4]")).click();
		
		//explore blogs
		//WebElement blog=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-footer/footer/div/div/div/div[1]/div[1]/ul/li[4]/a"))));
		//blog.click();
		//Navigate to main page
		//driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/div[1]/a")).click();
		
		//logout
		//WebElement profileagain=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a/span"))));
		//profileagain.click();
		//driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[7]")).click();
			
		
		
		
	}

}
