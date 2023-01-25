package puma.base;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class FormBase extends PumaPageBase {
    @FindBy(xpath = "//ul[@aria-labelledby='footer-support-nav-title']//a[text()='Purchase a Digital Gift Card']")
    private ExtendedWebElement digitalGiftBtn;

    @FindBy(xpath = "//select/option[@value='50']")
    ExtendedWebElement selectValue;

    @FindBy(id = "recipientName")
    ExtendedWebElement recipientName;

    @FindBy(id = "yourName")
    ExtendedWebElement yourName;
    @FindBy(id = "recipientEmail")
    ExtendedWebElement recipientEmail;
    @FindBy(id = "confirmEmail")
    ExtendedWebElement confirmEmail;
    @FindBy(id = "giftMessage")
    ExtendedWebElement giftMessage;

    @FindBy(xpath = "//button[@data-test-id='gift-card-add-to-cart']")
    ExtendedWebElement addToCartBtn;

    public FormBase(WebDriver driver) {
        super(driver);
    }

    public void clickDigitalGiftBtn(){
        digitalGiftBtn.scrollTo();
        digitalGiftBtn.click();
    }

    
    public void clickSelectValue(){
        selectValue.scrollTo();
        selectValue.click();
    }

    
    public void typeRecipientName(String name){
        recipientName.type(name);
    }

    
    public void typeYourName(String name){
        yourName.type(name);
    }

    
    public void typeRecipientEmail(String email){
        recipientEmail.type(email);
        confirmEmail.type(email);
    }

    
    public void typeGiftMessage(String message){
        giftMessage.type(message);
    }

    
    public void clickAddToCartBtn(){
        addToCartBtn.click();
    }


    @Override
    public boolean isPageOpened() {
        return addToCartBtn.isElementPresent();
    }

    @Override
    public void closePopUps(){
        clickStayOnUsBtn();
        clickCloseCookiesBtn();
        clickCloseSaleBtn();
    }
}
