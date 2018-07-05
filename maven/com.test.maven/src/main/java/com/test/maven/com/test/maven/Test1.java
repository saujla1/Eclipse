package com.test.maven.com.test.maven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	public static WebDriver driver;
	  @Parameters({"broname"})
	  @BeforeMethod
	  public static WebDriver selectBrowser(String bName) {
		  if(bName.equalsIgnoreCase(bName)) {
			  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			  driver =new ChromeDriver();
		  }
		  else if(bName.equalsIgnoreCase(bName)) {
			  System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  
		  }
			
		return driver;
		  
	  }
	@Test
	public void testcase1() {
		
		driver.get("https://www.edureka.co/");
		driver.findElement(By.id("homeSearchBar")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"homeSearchBarIcon\"]")).click();
		
		
	}

}
