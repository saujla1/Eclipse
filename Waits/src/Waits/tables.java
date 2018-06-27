package Waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tables {
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
	
	public static void main(String[] args) {
		browserName("chrome");
		driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
		List<WebElement> noofrows=driver.findElements(By.xpath("//*[@id=\"htmlTableId\"]/tbody/tr"));
		int sizeofrows=noofrows.size();
		System.out.println(sizeofrows);
		//getting the header
		List<WebElement> header=noofrows.get(0).findElements(By.tagName("th"));
		int sizeofheader=header.size();
		for (int i = 0; i < sizeofheader; i++) {
			String head=header.get(i).getText();
			System.out.print(head+"\t");
		}
		System.out.println();
		for (int i = 1; i < sizeofrows; i++) {
			List<WebElement> noofcolumns=noofrows.get(i).findElements(By.tagName("td"));
			int sizeofeachcolumn=noofcolumns.size();
			for (int j = 0; j < sizeofeachcolumn; j++) {
				String tabledata=noofcolumns.get(j).getText();
			System.out.println(tabledata + "\t");
			}
			
		}
	}

}
