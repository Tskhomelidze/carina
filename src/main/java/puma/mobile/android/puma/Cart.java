package puma.mobile.android.puma;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PumaPageBase.class)
public class Cart extends PumaPageBase {

    private static final Logger LOGGER = LogManager.getLogger(Cart.class);

    @FindBy(id = "branch-banner-iframe")
    ExtendedWebElement topBar;
    @FindBy(id = "branch-banner-close1")
    ExtendedWebElement closeMobileAppBtn;

    @FindBy(xpath = "//button[@data-test-id='stay-on-region-button']")
    ExtendedWebElement closeLocationBtn;

    @FindBy(xpath = "//span[@data-test-id='main-nav-menu-icon']")
    ExtendedWebElement menuBar;

    @FindBy(xpath = "//button[@data-link-name='Men']")
    ExtendedWebElement menBtn;

    @FindBy(xpath = "//button[@data-link-name='Shoes']")
    List<ExtendedWebElement> shoesBtn;

    @FindBy(xpath = "//a[@data-link-name='Classics']")
    ExtendedWebElement classicsBtn;

    @FindBy(xpath = "//button[@data-test-id='cookie-banner-close-btn']")
    ExtendedWebElement closeCookiesBtn;

    @FindBy(xpath = "//button[@data-test-id='newsletter-sign-up-form-button']/div")
    ExtendedWebElement closeSaleBtn;

    @FindBy(xpath = "//ul[@id='product-list-items']/li")
    List<ExtendedWebElement> productList;

    @FindBy(xpath = "//label[@data-size='0240']")
    ExtendedWebElement sizeBtn;

    @FindBy(xpath = "//button[@data-test-id='pdp-add-to-cart']")
    ExtendedWebElement addToCartBtn;

    public Cart(WebDriver driver) {
        super(driver);
    }
    public void clickCloseMobileAppBtn(){
        // How to use CustomTypePageFactory
        super.driver.switchTo().frame(topBar.getElement());
        closeMobileAppBtn.click();
        super.driver.switchTo().defaultContent();
    }

    public void clickCloseLocationBtn(){
        closeLocationBtn.click();
    }

    public void clickMenuBar(){
        menuBar.click();
    }

    public void clickMenBtn(){
        menBtn.click();
    }

    public void clickShoesBtn(){
        shoesBtn.get(1).click();
    }

    public void clickClassicsBtn(){
        classicsBtn.click();
    }

    public void refreshPage(){
        refresh(0);
    }

    public void clickCloseCookiesBtn(){
        closeCookiesBtn.click();
    }

    public void clickCloseSaleBtn(){
        closeSaleBtn.click();
    }

    public void selectProduct(){
        LOGGER.info("Product size = "+productList.size());
        productList.get(0).click();
    }

    public void selectSize(){
        sizeBtn.click();
    }

    public void clickAddToCart(){
        addToCartBtn.click();
    }

    public boolean isPageOpened(){
        return addToCartBtn.isElementPresent();
    }
}
