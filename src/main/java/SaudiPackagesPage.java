import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaudiPackagesPage extends PageBase{
    public SaudiPackagesPage(WebDriver webdriver) {
        super(webdriver);
    }

    @FindBy(id = "name-lite")
    WebElement liteType;
    @FindBy(xpath = "//*[@id='currency-lite']/b")
    WebElement litePrice;
    @FindBy(id = "name-classic")
    WebElement classicType;
    @FindBy(xpath = "//*[@id='currency-classic']/b")
    WebElement classicPrice;
    @FindBy(id = "name-premium")
    WebElement PremiumType;
    @FindBy(xpath = "//*[@id='currency-premium']/b")
    WebElement PremiumPrice;
    @FindBy(xpath = "//*[@id='currency-lite']/i/text()[1]")
    WebElement SaudiCurrency;
    @FindBy(id = "country-btn")
    WebElement changeCountryBTN;
    @FindBy(id = "bh")
    WebElement selectBahrain;

    public void clickONCountryBTN() {
        click ( changeCountryBTN);
    }

    public void selectBahrain(){
        click(selectBahrain);
    }
}
