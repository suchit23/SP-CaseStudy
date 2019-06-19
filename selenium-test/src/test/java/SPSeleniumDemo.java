package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SPSeleniumDemo {


@Test
public void checkRootPage() {
  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
  ChromeOptions options = new ChromeOptions();
  options.addArguments("--headless");
  options.addArguments("--no-sandbox");
  options.addArguments("--disable-dev-shm-usage");
  
  WebDriver driver = new ChromeDriver(options);
  String appURL = "http://test.suchit23.in:8080";
  // launch the chrome browser and open the application url
  driver.get(appURL);
  //maximize the browser window
  driver.manage().window().maximize();
  String expectedText = "Hello Suchit's World!";
  //fetch the body of the web page
  String bodyText = driver.findElement(By.tagName("body")).getText();
  //check if the body has the text we are expecting
  Assert.assertTrue(bodyText.contains(expectedText));
  // close the web browser
  driver.quit();
}

@Test
public void checkSamplePage() {
	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
  ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	options.addArguments("--no-sandbox");
	options.addArguments("--disable-dev-shm-usage");
	
  WebDriver driver = new ChromeDriver(options);
  String appURL = "http://test.suchit23.in:8080/sample.txt";
  // launch the chrome browser and open the application url
  driver.get(appURL);
  //maximize the browser window
  driver.manage().window().maximize();
  String expectedText = "Suchit Prasanna";
  //fetch the body of the web page
  String bodyText = driver.findElement(By.tagName("body")).getText();
	//check if the body has the text we are expecting
  Assert.assertTrue(bodyText.contains(expectedText));
  // close the web browser
  driver.quit();
}

} 
