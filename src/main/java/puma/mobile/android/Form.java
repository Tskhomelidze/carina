package puma.mobile.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import puma.base.FormBase;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = FormBase.class)
public class Form extends FormBase {

    @FindBy(id = "branch-banner-iframe")
    private ExtendedWebElement topBar;

    @FindBy(id = "branch-banner-close1")
    private ExtendedWebElement closeMobileAppBtn;

    public Form(WebDriver driver) {
        super(driver);
    }

    public void clickCloseMobileAppBtn(){
        super.driver.switchTo().frame(topBar.getElement());
        closeMobileAppBtn.click();
        super.driver.switchTo().defaultContent();
    }

    @Override
    public void closePopUps(){
        clickCloseMobileAppBtn();
        clickStayOnUsBtn();
        clickCloseCookiesBtn();
        clickCloseSaleBtn();
    }
}
