package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("TestUser");
		driver.findElement(By.id("u_0_e")).sendKeys("TesUserLastName");
		driver.findElement(By.linkText("Why do I need to provide my birthday?")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		

	}

}
