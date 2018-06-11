package locatorPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bookflight 
{
	public static WebDriver driver;
	public static WebDriverWait wait=null;
	
	
	public static void main(String[] args)throws Exception
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumFiles\\Selenium\\Drivers\\chromedriver.exe");
		
		
		driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		 wait = new WebDriverWait(driver, 40);
		
		
		WebElement selectOneWay = driver.findElement(By.xpath(".//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[2]/a"));
		selectOneWay.click();
	    
	    WebElement okAlert= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='globalModal']/div/div/div[3]/button")));
	    okAlert.click();
	    
	    
	    
	    WebElement fromtext= driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/input[1]"));
	    fromtext.clear();	
		fromtext.sendKeys("Bengaluru");
		
		
		
		WebElement toText= driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[1]/ul/li[2]/input[1]"));
	    toText.clear();	
		toText.sendKeys("Lucknow");
		
	   
		WebElement adult= driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[1]/ul/li[3]/div/div[1]/label[2]/select"));
		adult.click();
		WebElement adultsel= driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[1]/ul/li[3]/div/div[1]/label[2]/select/option[3]"));
		adultsel.click();
		
		
		
		WebElement child= driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[1]/ul/li[3]/div/div[2]/label[2]/select"));
		child.click();
		
		WebElement childsel= driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[1]/ul/li[3]/div/div[2]/label[2]/select/option[3]"));
		childsel.click();
		
	
	
		WebElement search= driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[2]/button"));
		search.click();
	
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		
        List<WebElement> lists=driver.findElements(By.xpath(".//*[@id='flightSelectMount']/div/div[2]/div/div/div/div[2]/div/div/div/div/div"));
		
		for(WebElement list:lists)
		{
			System.out.println(list.getText());
		}	
}

}
