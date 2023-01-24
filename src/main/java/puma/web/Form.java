package puma.web;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import puma.base.FormBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = FormBase.class)
public class Form extends FormBase {

    public Form(WebDriver driver) {
        super(driver);
    }

    @Override
    public void closePopUps(){
        clickStayOnUsBtn();
        clickCloseCookiesBtn();
        clickCloseSaleBtn();
    }
}
