package puma.mobile.android.puma;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PumaPageBase.class)
public class Cart extends PumaPageBase {

    private static final Logger LOGGER = LogManager.getLogger(Cart.class);

    @FindBy(xpath = "//button[@data-link-name='Men']")
    ExtendedWebElement menBtn;

    @FindBy(xpath = "//button[@data-link-name='Shoes']")
    List<ExtendedWebElement> shoesBtn;

    @FindBy(xpath = "//a[@data-link-name='Classics']")
    ExtendedWebElement classicsBtn;

    @FindBy(xpath = "//label[@data-size='0240']")
    ExtendedWebElement sizeBtn;

    @FindBy(xpath = "//button[@data-test-id='pdp-add-to-cart']")
    ExtendedWebElement addToCartBtn;

    public Cart(WebDriver driver) {
        super(driver);
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

    public void selectProduct(){
        LOGGER.info("Product size = "+productList.size());
        productList.get(0).click();
    }

    public void selectSize(){
        sizeBtn.click();
    }

    public void clickAddToCart(){
        isPageOpened();
        addToCartBtn.click();
    }

    @Override
    public boolean isPageOpened(){
        return addToCartBtn.isElementPresent();
    }
}
