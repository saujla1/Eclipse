package locatorPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {
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
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		return driver;
		}
	public static void browserClose() {
		driver.close();
		
	}
	public static void main(String[] args) {
		browserName("chrome");
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"bookingflightTab\"]/div[2]/div[1]/ul[1]/li[2]/a")).click();
		driver.navigate().refresh();
		
		//Select origin
		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/input[1]")).click();
		//select Banglore
		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/div/ul/li[26]/a")).click();
		//select destination
		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[2]/input[1]")).click();
		//select Lucknow
		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[2]/div/ul/li[33]")).click();
		
		//select passenger
		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/input")).click();
		//select Adult
		WebElement selectAdult=driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/div/div[1]/label[2]/select"));
			
		Select sel_adult=new Select(selectAdult);
		sel_adult.selectByVisibleText("3");
		
		//select child
		WebElement selectChild=driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/div/div[2]/label[2]/select"));
		Select sel_child=new Select(selectChild);
		sel_child.selectByVisibleText("2");
		
		WebElement search_button=driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[2]/button"));
		search_button.click();
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		List<WebElement> lists=driver.findElements(By.xpath(".//*[@id='flightSelectMount']/div/div[2]/div/div/div/div[2]/div/div/div/div/div"));

			for(WebElement list:lists)
			{
				System.out.println(list.getText());
			}	
		
		
		
		
		
		
		
		
	}

}
