package puma.mobile.android.puma;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class PumaPageBase extends AbstractPage implements IMobileUtils {

    @FindBy(id = "branch-banner-iframe")
    ExtendedWebElement topBar;
    @FindBy(id = "branch-banner-close1")
    ExtendedWebElement closeMobileAppBtn;

    @FindBy(xpath = "//button[@data-test-id='stay-on-region-button']")
    ExtendedWebElement stayOnUsBtn;

    @FindBy(xpath = "//span[@data-test-id='main-nav-menu-icon']")
    ExtendedWebElement menuBar;

    @FindBy(xpath = "//button[@data-test-id='cookie-banner-close-btn']")
    ExtendedWebElement closeCookiesBtn;

    @FindBy(xpath = "//button[@data-test-id='newsletter-sign-up-form-button']/div")
    ExtendedWebElement closeSaleBtn;

    @FindBy(xpath = "//ul[@id='product-list-items']/li")
    List<ExtendedWebElement> productList;

    public PumaPageBase(WebDriver driver) {
        super(driver);
    }

    public void clickCloseMobileAppBtn(){
        super.driver.switchTo().frame(topBar.getElement());
        closeMobileAppBtn.click();
        super.driver.switchTo().defaultContent();
    }

    public void clickMenuBar(){
        menuBar.click();
    }

    public void clickStayOnUsBtn(){
        stayOnUsBtn.click();
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

    public abstract boolean isPageOpened();
}
