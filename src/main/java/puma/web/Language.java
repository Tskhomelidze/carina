package puma.web;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import puma.base.LanguageBase;
import puma.base.PumaPageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = LanguageBase.class)
public class Language extends LanguageBase {

    @FindBy(xpath = "//button[@data-test-id='account-button']")
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
}
