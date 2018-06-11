package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {
	public static WebDriver driver;
	public static WebDriver browserName(String bName) {
		if(bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			
		}
		else {
			System.out.println("Browser name is not mentioned");
		}
		return driver;
		}
	
	public static void main(String[] args) {
		browserName("chrome");
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[2]/td/input[@type='email']")).sendKeys("abc@yahoo.com");
		WebElement dayDropDown=driver.findElement(By.name("birthday_day"));
		WebElement monthDropDown=driver.findElement(By.name("birthday_month"));
		WebElement yearDropDown=driver.findElement(By.name("birthday_year"));
		Select sel_day=new Select(dayDropDown);
		Select sel_month=new Select(monthDropDown);
		Select sel_year=new Select(yearDropDown);
		sel_day.selectByIndex(17);
		sel_month.selectByVisibleText("Sep");
		sel_year.selectByValue("2005");
		

	}

}
