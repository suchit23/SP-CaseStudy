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
public void doLogin() {
	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
 	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	options.addArguments("--no-sandbox");
	options.addArguments("--disable-dev-shm-usage");
	
        WebDriver driver = new ChromeDriver(options);
        String appURL = "http://35.244.58.31:8081";
             // launch the firefox browser and open the application url
              driver.get(appURL);
             
// maximize the browser window
              driver.manage().window().maximize();
             
// declare and initialize the variable to store the expected title of the webpage.
              String expectedTitle = " Sign in - Google Accounts ";
             
// fetch the title of the web page and save it into a string variable
              String actualTitle = driver.getTitle();
              Assert.assertEquals(expectedTitle,actualTitle);
             
// close the web browser
              driver.close();
}
} 
