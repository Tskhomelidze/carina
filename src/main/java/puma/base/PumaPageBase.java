package puma.base;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class PumaPageBase extends AbstractPage {

    @FindBy(xpath = "//button[@data-test-id='stay-on-region-button']")
    protected ExtendedWebElement stayOnUsBtn;

    @FindBy(xpath = "//button[@data-test-id='cookie-banner-close-btn']")
    protected ExtendedWebElement closeCookiesBtn;

    @FindBy(xpath = "//button[@data-test-id='newsletter-sign-up-form-button']/div")
    protected ExtendedWebElement closeSaleBtn;

    @FindBy(xpath = "//ul[@id='product-list-items']/li")
    protected List<ExtendedWebElement> productList;

    public PumaPageBase(WebDriver driver) {
        super(driver);
    }

    public void clickStayOnUsBtn(){
        stayOnUsBtn.click();
    }

    public void clickCloseCookiesBtn(){
        closeCookiesBtn.click();
    }

    public void clickCloseSaleBtn(){
        closeSaleBtn.click();
    }

    public abstract boolean isPageOpened();

    public abstract void closePopUps();
}
