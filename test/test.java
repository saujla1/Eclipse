package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.facebook.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("u_0_c")).clear();
    driver.findElement(By.id("u_0_c")).sendKeys("abc");
    driver.findElement(By.id("u_0_e")).clear();
    driver.findElement(By.id("u_0_e")).sendKeys("def");
    driver.findElement(By.id("u_0_h")).click();
    driver.findElement(By.id("u_0_h")).clear();
    driver.findElement(By.id("u_0_h")).sendKeys("5674898735");
    driver.findElement(By.id("u_0_o")).clear();
    driver.findElement(By.id("u_0_o")).sendKeys("abcdef");
    driver.findElement(By.id("u_0_9")).click();
    driver.findElement(By.id("birthday-help")).click();
    driver.findElement(By.linkText("Forgot account?")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
