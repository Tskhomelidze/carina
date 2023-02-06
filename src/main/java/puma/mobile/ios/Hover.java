package puma.mobile.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import puma.Product;
import puma.base.HoverBase;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HoverBase.class)
public class Hover extends HoverBase {

    private static final Logger LOGGER = LogManager.getLogger(Hover.class);

    @FindBy(xpath = "//span[@data-test-id='main-nav-menu-icon']")
    private ExtendedWebElement menuBar;

    @FindBy(xpath = "//button[@data-link-name='Sport']")
    private ExtendedWebElement sportBtn;

    @FindBy(xpath = "//button[@data-link-name='Training']")
    ExtendedWebElement trainingBtn;

    @FindBy(id = "branch-banner-iframe")
    private ExtendedWebElement topBar;

    @FindBy(id = "branch-banner-close1")
    private ExtendedWebElement closeMobileAppBtn;

    public Hover(WebDriver driver) {
        super(driver);
    }

    private void clickMenuBar(){
        menuBar.click();
    }

    @Override
    public void clickSportBtn(){
        clickMenuBar();
        sportBtn.click();
    }

    private void clickTrainingBtn(){
        trainingBtn.click();
    }

    @Override
    public void clickShopAllTrainingBtn(){
        clickTrainingBtn();
        shopAllTrainingBtn.click();
    }

    @Override
    public void printAllProducts(){
        LOGGER.info("Products size = "+productList.size());
        for(Product product : productList){
            LOGGER.info(product.getName());
        }
    }

    public void clickCloseMobileAppBtn(){
        super.driver.switchTo().frame(topBar.getElement());
        closeMobileAppBtn.click();
        super.driver.switchTo().defaultContent();
    }

    @Override
    public void closePopUps(){
        clickCloseMobileAppBtn();
        super.closePopUps();
    }
}
