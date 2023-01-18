package puma.mobile.android.puma;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PumaPageBase.class)
public class Hover extends PumaPageBase{

    private static final Logger LOGGER = LogManager.getLogger(Hover.class);

    @FindBy(xpath = "//button[@data-link-name='Sport']")
    ExtendedWebElement sportBtn;
    @FindBy(xpath = "//button[@data-link-name='Training']")
    ExtendedWebElement trainingBtn;
    @FindBy(xpath = "//a[@data-link-name='Shop All Training']")
    ExtendedWebElement shotAllTrainingBtn;

    public Hover(WebDriver driver) {
        super(driver);
    }

    public void clickSportBtn(){
        sportBtn.click();
    }

    public void clickTrainingBtn(){
        trainingBtn.click();
    }

    public void clickShopAllTrainingBtn(){
        shotAllTrainingBtn.click();
    }

    public void printAllProducts(){
        LOGGER.info("Products size = "+productList.size());
        for(ExtendedWebElement product : productList){
            LOGGER.info(product.getText());
        }
    }

    @Override
    public boolean isPageOpened() {
        return !productList.isEmpty();
    }
}
