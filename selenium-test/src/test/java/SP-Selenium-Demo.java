package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {
       public WebDriver driver = new FirefoxDriver();
       String appUrl = "http://35.244.58.31:8081";

@Test
public void doLogin() {
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
