package locatorPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserNameMethod {
	public static WebDriver driver;
	public static WebDriver browserName(String bName) {
		if (bName.equalsIgnoreCase("chrome")){
			System.getProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if (bName.equalsIgnoreCase("firefox")) {
			System.getProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("Browser name is not mentioned");
		}
				
		return driver;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browserName("firefox");
		//Following are the Browser commands
		//1. get command
		driver.get("https://www.edureka.co/");
		//2. get title- returns title of the tab
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		//3. get current URL
		String pageURL=driver.getCurrentUrl();
		System.out.println(pageURL);
		//4.get window handle- session ID of the particular browser window
		String browserSessionID=driver.getWindowHandle();
		System.out.println(browserSessionID);
		//close and quit- both close the browser// "close" closes the tab only. //"quit" closes the browser
		driver.close();
		driver.quit();
		//Browser navigation commands
		//1. navigate to the the URL(replacement of driver.get)
		driver.navigate().to("https://www.edureka.co/");
		//2. back command- how to navigate to the previous page
		driver.navigate().back();
		//3. forward command
		driver.navigate().forward();
		//4. refresh command- refreshes the current page
		driver.navigate().refresh();
		
		//Creating an object of the WebElement. It is a better way to find an element on page'
		WebElement forgot_link=driver.findElement(By.xpath("//*[@id=\\\"yui_3_18_0_3_1527919067829_1264\\\"]"));
		forgot_link.click();
		WebElement fetchValue=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[20]/label"));
		String valueOnWebsites=fetchValue.getText();
		
		System.out.println(valueOnWebsites);
		
		//list of web elements such as number of radio button on a page. Notice the method "findElements" instead of "findElement"
		List<WebElement> allRadioBtns=driver.findElements(By.cssSelector("input[type='radio']"));
		int radioBtnNum= allRadioBtns.size();
		System.out.println(radioBtnNum);
		//get names of all radio buttons. Create a loop
				for (int i=0; i < radioBtnNum; i++) {
					String nameOfRadioBtn=allRadioBtns.get(i).getAttribute("value");
					System.out.println(nameOfRadioBtn);
					if(nameOfRadioBtn.equalsIgnoreCase("Male")) {
						System.out.println("My test case is pass");
					}
				}
				
		//working with drop down
		browserName("chrome");
		driver.navigate().to("https://www.edureka.co/");
		WebElement dayDropDown=driver.findElement(By.name("birthday_day"));
		WebElement monthDropDown=driver.findElement(By.name("birthday_month"));
		WebElement yearDropDown=driver.findElement(By.name("birthday_year"));
		Select sel_day=new Select(dayDropDown);
		Select sel_month=new Select(monthDropDown);
		Select sel_year=new Select(yearDropDown);
		sel_day.selectByIndex(17);
		sel_month.selectByVisibleText("Sept");
		sel_year.selectByValue("2005");
		
		
		
		
		

	}

}
