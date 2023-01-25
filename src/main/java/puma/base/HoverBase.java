package puma.base;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class HoverBase extends PumaPageBase {

    @FindBy(xpath = "//a[@data-link-name='Shop All Training']")
    protected ExtendedWebElement shopAllTrainingBtn;
    public HoverBase(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return !productList.isEmpty();
    }

    public abstract void clickSportBtn();

    public abstract void clickShopAllTrainingBtn();

    public abstract void printAllProducts();

    @Override
    public void closePopUps(){
        clickStayOnUsBtn();
        clickCloseCookiesBtn();
        clickCloseSaleBtn();
    }

}
