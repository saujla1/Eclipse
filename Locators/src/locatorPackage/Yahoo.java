package locatorPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {
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
		//WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		//browserName("chrome");
		
		//driver.get("https://www.edureka.co/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"yui_3_18_0_3_1527919067829_1264\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"mega-bottombar\"]/ul/li[2]/a")).click();
		//driver.findElement(By.xpath("//div[@class='container']//button[@id='trigger-how-it-works']")).click();
		
		//switch browsers
			
		browserName("firefox");
		driver.get("https://www.edureka.co/");
		
		
		//Following are the Browser commands
		//get- driver.get("https://www.edureka.co/");
		//get title- returns title of the tab
		String page1title=driver.getTitle();
		System.out.println(page1title);
		//get current URL
		String page1URL=driver.getCurrentUrl();
		System.out.println(page1URL);
		//get window handle- session ID of the particular browser window
		
		String browser1SessionID=driver.getWindowHandle();
		System.out.println(browser1SessionID);
		browserName("chrome");
		driver.get("https://www.edureka.co/");
		//driver.navigate().to("https://www.edureka.co/");
		//Thread.sleep(2000);
		//close and quit- both close the browser// "close" closes the tab only. //"quit" closes the browser
		//driver.close();
		//driver.quit();
		//Browser navigation commands
		//To command- replacement of driver.get() command
		driver.navigate().to("https://www.edureka.co/");
		//back command- how to navigate to the previous page
		//driver.navigate().back();
		//forward
		//driver.navigate().forward();
		//refresh- refreshes the page
		//driver.navigate().refresh();
		
		//better way of finding element- creating a object of web element
		//WebElement link_forgot= driver.findElement(By.xpath("//*[@id=\"yui_3_18_0_3_1527919067829_1264\"]"));
		//link_forgot.click();
		
		//find elements
		browserName("chrome");
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement fetchvalue =driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[20]/label"));
		String valueonwebsites=fetchvalue.getText();
		System.out.println(valueonwebsites);
		//list of web elements such as number of radio button on a page
		List<WebElement> allradiobtns=driver.findElements(By.cssSelector("input[type='radio']"));
		int raobtn =allradiobtns.size();
		System.out.println(raobtn);
		
		//arrtibute value
		
		WebElement name_maleradiobtn=driver.findElement(By.id("sex-o"));
		String attributevalue_malebutton =name_maleradiobtn.getAttribute("value");
		
		//get names of all radio buttons. Create a loop
		for (int i=0; i<raobtn; i++) {
			
		}
	}
//drop down- by visible text, by index, by value
}
