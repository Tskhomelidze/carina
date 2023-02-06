package puma.mobile.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import puma.Product;
import puma.base.SearchBarBase;

import java.time.Duration;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SearchBarBase.class)
public class SearchBar extends SearchBarBase {

    private static final Logger LOGGER = LogManager.getLogger(SearchBar.class);

    @FindBy(xpath = "//input[@data-test-id='search-box-mobile']")
    ExtendedWebElement searchBar;

    @FindBy(id = "branch-banner-iframe")
    private ExtendedWebElement topBar;

    @FindBy(id = "branch-banner-close1")
    private ExtendedWebElement closeMobileAppBtn;

    public SearchBar(WebDriver driver) {
        super(driver);
    }

    public void clickSearchIcon(){
        searchIcon.click();
    }

    @Override
    public void search(String searchText) {
        clickSearchIcon();
        searchBar.type(searchText);
        searchBar.sendKeys(Keys.ENTER);
    }

    public void printAllItemInfo() {
        LOGGER.info("Elements size = " + productList.size());
        for (Product product : productList) {
            LOGGER.info(product.getName());
        }
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
