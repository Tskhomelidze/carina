package puma.base;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class SearchBarBase extends PumaPageBase{
    @FindBy(xpath = "//button[@data-test-id='search-icon-nav']")
    protected ExtendedWebElement searchIcon;
    public SearchBarBase(WebDriver driver) {
        super(driver);
    }

    public abstract void search(String searchText);

    public abstract void printAllItemInfo();

    @Override
    public boolean isPageOpened() {
        return !productList.isEmpty();
    }

    @Override
    public void closePopUps(){
        clickStayOnUsBtn();
        clickCloseCookiesBtn();
        clickCloseSaleBtn();
    }

}
