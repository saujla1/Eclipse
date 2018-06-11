package locatorPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingList {
	public static WebDriver driver;
	public static WebDriver browserName(String bName) {
		if (bName.equalsIgnoreCase("chrome")) {
			
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
		}
		else if (bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
	return driver;
	}
	public static void main(String[] args) {
		browserName("chrome");
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/input[1]")).click();
		
		List<WebElement> origin=driver.findElements(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/div/ul"));
		int s=origin.size();
		
		System.out.println(s);
		for (WebElement list:origin) {
			System.out.println(list.getText());
			if(list.getText().contains("Bengaluru (BLR)")) {
				System.out.println("Bengaluru found");
				
			}
			else {
				System.out.println("Bengaluru (BLR) not found");
			}
			}
		//working with pop ups
				driver.get("url");
			//open a pop up
		}
	
	
		

	}


