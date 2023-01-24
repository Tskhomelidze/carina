package puma.web;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import puma.base.SearchBarBase;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SearchBarBase.class)
public class SearchBar extends SearchBarBase {

    private static final Logger LOGGER = LogManager.getLogger(SearchBar.class);
    @FindBy(xpath = "//input[@data-test-id='search-box']")
    ExtendedWebElement searchBar;

    public SearchBar(WebDriver driver) {
        super(driver);
    }
    @Override
    public void search(String searchText) {
        searchBar.type(searchText);
        searchBar.sendKeys(Keys.ENTER);
    }

    public void printAllItemInfo() {
        LOGGER.info("Elements size = " + productList.size());
        for (ExtendedWebElement product : productList) {
            LOGGER.info(product.getText());
        }
    }

    @Override
    public boolean isPageOpened() {
        return searchIcon.isElementPresent();
    }

    @Override
    public void closePopUps(){
        clickStayOnUsBtn();
        clickCloseCookiesBtn();
        clickCloseSaleBtn();
    }
}
