package puma.mobile.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import puma.base.CartBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartBase.class)
public class Cart extends CartBase {
    private static final Logger LOGGER = LogManager.getLogger(Cart.class);

    @FindBy(id = "branch-banner-iframe")
    private ExtendedWebElement topBar;

    @FindBy(id = "branch-banner-close1")
    private ExtendedWebElement closeMobileAppBtn;

    @FindBy(xpath = "//span[@data-test-id='main-nav-menu-icon']")
    private ExtendedWebElement menuBar;

    @FindBy(xpath = "//button[@data-link-name='Men']")
    private ExtendedWebElement menBtn;

    public Cart(WebDriver driver) {
        super(driver);
    }

    public void selectProduct(){
        LOGGER.info("Product size = "+productList.size());
        productList.get(0).click();
    }

    @Override
    public boolean isPageOpened(){
        return addToCartBtn.isElementPresent();
    }

    public void clickCloseMobileAppBtn(){
        super.driver.switchTo().frame(topBar.getElement());
        closeMobileAppBtn.click();
        super.driver.switchTo().defaultContent();
    }

    public void clickMenuBar(){
        menuBar.click();
    }

    public void clickMenBtn(){
        clickMenuBar();
        menBtn.click();
    }

    @Override
    public void clickClassicsBtn(){
        clickShoesBtn();
        classicsBtn.click();
    }

    @Override
    public void closePopUps(){
        clickCloseMobileAppBtn();
        clickStayOnUsBtn();
        clickCloseCookiesBtn();
        clickCloseSaleBtn();
    }
}
