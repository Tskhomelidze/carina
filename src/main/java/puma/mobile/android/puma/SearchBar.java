package puma.mobile.android.puma;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PumaPageBase.class)
public class SearchBar extends PumaPageBase {

    private static final Logger LOGGER = LogManager.getLogger(SearchBar.class);

    @FindBy(xpath = "//button[@data-test-id='search-icon-nav']")
    ExtendedWebElement searchIcon;
    @FindBy(xpath = "//input[@data-test-id='search-box-mobile']")
    ExtendedWebElement searchBar;

//    @FindBy(xpath = "//li[@data-test-id='product-list-item']")
//    List<ExtendedWebElement> productsList;

    public SearchBar(WebDriver driver) {
        super(driver);
    }

    public void clickSearchIcon(){
        searchIcon.click();
    }

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
        return !productList.isEmpty();
    }

    @Override
    public void closePopUps() {

    }
}
