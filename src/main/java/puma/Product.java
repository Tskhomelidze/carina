package puma;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Product extends AbstractUIObject {
    @FindBy(xpath = "//span[@data-test-id='price']")
    private ExtendedWebElement price;

    public String getPrice(){
        return price.getText();
    }

    public void click(){
        this.getRootExtendedElement().click();
    }

    public String getDescription(){
        return super.getRootExtendedElement().getText();
    }


    public Product(WebDriver driver) {
        super(driver);
    }

    public Product(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
