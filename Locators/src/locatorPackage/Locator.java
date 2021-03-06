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
		//absolute path
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).click();
		//xpath is the most preferred locator.
		//relative path. Usually use  path received from chrome browser, select element and copy xpath. ChroPath addon is not needed for this. This is relative xpath from  browser "//*[@id="email"]"
		//driver.findElement(By.xpath("//* [@id='full_name']/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).clear();
		//use the "starts with" and "contains" when web element values are dynamic.
		
		

	}
}