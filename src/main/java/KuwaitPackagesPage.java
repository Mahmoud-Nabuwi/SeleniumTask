import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KuwaitPackagesPage extends PageBase{
    public KuwaitPackagesPage(WebDriver webdriver) {
        super(webdriver);
    }

    @FindBy(xpath = "//*[@id='country-name']")
    WebElement countrySelectedName;

    @FindBy(xpath = "//*[@id='currency-lite']/i/text()[1]")
    WebElement KwCurrency;

}
