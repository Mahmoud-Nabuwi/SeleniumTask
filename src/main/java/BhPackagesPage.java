import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BhPackagesPage extends PageBase{
    public BhPackagesPage(WebDriver webdriver) {
        super(webdriver);
    }

    @FindBy(xpath = "//*[@id='country-name']")
    WebElement countrySelectedName;
    @FindBy(id = "kw")
    WebElement selectKuwait;
    @FindBy(id = "country-btn")
    WebElement changeCountryBTN;
    @FindBy(xpath = "//*[@id='currency-lite']/i/text()[1]")
    WebElement bhCurrency;

    public void selectKuwait(){
        click(changeCountryBTN);
        click(selectKuwait);
    }
}
