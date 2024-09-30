

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    protected WebDriver driver;
    public static final long WAIT = 10;

    public PageBase(WebDriver webdriver) {
        driver =webdriver;
        PageFactory.initElements(driver, this);
    }

    public WebElement waitForElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,WAIT);
        return  wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(WebElement element){
        waitForElementToBeClickable(element).click();
    }

}
