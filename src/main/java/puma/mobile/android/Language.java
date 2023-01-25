package puma.mobile.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import puma.base.LanguageBase;
import puma.base.PumaPageBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LanguageBase.class)
public class Language extends LanguageBase {

    @FindBy(id = "branch-banner-iframe")
    private ExtendedWebElement topBar;

    @FindBy(id = "branch-banner-close1")
    private ExtendedWebElement closeMobileAppBtn;

    @FindBy(xpath = "//span[@data-test-id='main-nav-menu-icon']")
    private ExtendedWebElement menuBar;

    public Language(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickMenuBar() {
        menuBar.click();
    }

    @Override
    public boolean isPageOpened() {
        return menuBar.isElementPresent();
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
