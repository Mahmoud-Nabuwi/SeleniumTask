import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.*;

import java.util.HashMap;

public class TestBase {

    public static WebDriver driver;


    @BeforeTest
    public void startDriver() {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://subscribe.stctv.com/sa-en");
    }

    @AfterTest
    public void stopDriver() {
		driver.quit();
	}

}