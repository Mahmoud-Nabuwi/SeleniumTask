import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class validateSubscriptionPackage extends TestBase{

    SaudiPackagesPage saudiPage;
    String liteSubType;
    String litePrice;
    String classicType;
    String classicPrice;
    String PremiumType;
    String PremiumPrice;
    BhPackagesPage bahrainPage;
    KuwaitPackagesPage kuwaitPage;

    @Test
    public void validateSaudisPackage(){
        saudiPage = new SaudiPackagesPage(driver);
        liteSubType = saudiPage.liteType.getText();
        Assert.assertEquals(liteSubType,"LITE");

        litePrice = saudiPage.litePrice.getText();
        Assert.assertEquals(litePrice,"15");

        classicType = saudiPage.classicType.getText();
        Assert.assertEquals(classicType,"CLASSIC");

        classicPrice = saudiPage.classicPrice.getText();
        Assert.assertEquals(classicPrice,"25");

        PremiumType = saudiPage.PremiumType.getText();
        Assert.assertEquals(PremiumType,"PREMIUM");

        PremiumPrice = saudiPage.PremiumPrice.getText();
        Assert.assertEquals(PremiumPrice,"60");

        String saudiCurrency = saudiPage.SaudiCurrency.getText();
        Assert.assertEquals(saudiCurrency,"SAR");
    }
    @Test
    public void validateBahrainPackages(){
        saudiPage = new SaudiPackagesPage(driver);
        saudiPage.clickONCountryBTN();
        saudiPage.selectBahrain();
        bahrainPage = new BhPackagesPage(driver);
        String bahrain = bahrainPage.countrySelectedName.getText();
        Assert.assertEquals(bahrain,"Bahrain");
        liteSubType = saudiPage.liteType.getText();
        Assert.assertEquals(liteSubType,"LITE");

        litePrice = saudiPage.litePrice.getText();
        Assert.assertEquals(litePrice,"2");

        classicType = saudiPage.classicType.getText();
        Assert.assertEquals(classicType,"CLASSIC");

        classicPrice = saudiPage.classicPrice.getText();
        Assert.assertEquals(classicPrice,"3");

        PremiumType = saudiPage.PremiumType.getText();
        Assert.assertEquals(PremiumType,"PREMIUM");

        PremiumPrice = saudiPage.PremiumPrice.getText();
        Assert.assertEquals(PremiumPrice,"6");

        bahrainPage = new BhPackagesPage(driver);
        String bhCurrency =  bahrainPage.bhCurrency.getText();
        Assert.assertEquals(bhCurrency,"BHD");
    }

    public  void validateKuwaitPackages(){
        bahrainPage = new BhPackagesPage(driver);
        bahrainPage.selectKuwait();

        liteSubType = saudiPage.liteType.getText();
        Assert.assertEquals(liteSubType,"LITE");

        litePrice = saudiPage.litePrice.getText();
        Assert.assertEquals(litePrice,"1.2");

        classicType = saudiPage.classicType.getText();
        Assert.assertEquals(classicType,"CLASSIC");

        classicPrice = saudiPage.classicPrice.getText();
        Assert.assertEquals(classicPrice,"2.5");

        PremiumType = saudiPage.PremiumType.getText();
        Assert.assertEquals(PremiumType,"PREMIUM");

        PremiumPrice = saudiPage.PremiumPrice.getText();
        Assert.assertEquals(PremiumPrice,"4.8");

        kuwaitPage = new KuwaitPackagesPage(driver);
        String kwCurrency = kuwaitPage.KwCurrency.getText();
        Assert.assertEquals(kwCurrency,"BHD");

    }
}
