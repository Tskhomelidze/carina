package puma.base;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class CartBase extends PumaPageBase {

    @FindBy(xpath = "//button[@data-link-name='Shoes']")
    protected List<ExtendedWebElement> shoesBtn;

    @FindBy(xpath = "//a[@data-link-name='Classics']")
    protected ExtendedWebElement classicsBtn;

    @FindBy(xpath = "//label[@data-size='0240']")
    protected ExtendedWebElement sizeBtn;

    @FindBy(xpath = "//button[@data-test-id='pdp-add-to-cart']")
    protected ExtendedWebElement addToCartBtn;

    public void clickShoesBtn(){
        shoesBtn.get(1).click();
    }

    public void clickClassicsBtn(){
        classicsBtn.click();
    }

    public void selectSize(){
        sizeBtn.scrollTo();
        sizeBtn.click();
    }

    public void clickAddToCart(){
        addToCartBtn.scrollTo();
        addToCartBtn.click();
    }

    public abstract void clickMenBtn();

    public abstract void selectProduct();


    public CartBase(WebDriver driver) {
        super(driver);
    }

}
