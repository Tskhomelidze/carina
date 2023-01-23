package puma.web;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import puma.base.CartBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CartBase.class)
public class Cart extends CartBase {

    private static final Logger LOGGER = LogManager.getLogger(Cart.class);

    @FindBy(xpath = "//a[@data-link-name='Men']")
    protected ExtendedWebElement menBtn;

    public Cart(WebDriver driver) {
        super(driver);
    }


    @Override
    public boolean isPageOpened() {
        return addToCartBtn.isElementPresent();
    }

    public void clickMenBtn(){
        menBtn.hover();
    }

    public void selectProduct(){
        LOGGER.info("Product size = "+productList.size());
        productList.get(0).click();
    }

    @Override
    public void closePopUps() {
        clickStayOnUsBtn();
        clickCloseCookiesBtn();
        clickCloseSaleBtn();
    }

}
