package puma.web;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import puma.base.HoverBase;


@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HoverBase.class)
public class Hover extends HoverBase {

    @FindBy(xpath = "//a[@data-link-name='Sport']")
    private ExtendedWebElement sportBtn;

    private static final Logger LOGGER = LogManager.getLogger(Hover.class);

    public Hover(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickSportBtn(){
        sportBtn.hover();
    }

    @Override
    public void clickShopAllTrainingBtn(){
        shopAllTrainingBtn.click();
    }

    @Override
    public void printAllProducts(){
        LOGGER.info("Products size = "+productList.size());
        for(ExtendedWebElement product : productList){
            LOGGER.info(product.getText());
        }
    }

    @Override
    public void closePopUps(){
        clickStayOnUsBtn();
        clickCloseCookiesBtn();
        clickCloseSaleBtn();
    }
}
