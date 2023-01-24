package puma.base;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class LanguageBase extends PumaPageBase{

    @FindBy(xpath = "//li[@class='py-2']")
    private ExtendedWebElement languageBtn;

    @FindBy(xpath = "//a[@hreflang='es-es']")
    private ExtendedWebElement spanishLanguageBtn;

    @FindBy(id = "onetrust-accept-btn-handler")
    private ExtendedWebElement acceptCookiesBtn;

    @FindBy(xpath = "//a[@data-js-change-locale]")
    private ExtendedWebElement languageBtnOnSpanishPage;

    @FindBy(xpath = "//input[@id='locale-search-input']")
    private ExtendedWebElement languageSearchBar;

    @FindBy(xpath = "//a[@data-locale='en_US']")
    ExtendedWebElement englishLangBtn;

    public LanguageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickMenuBar();

    public void clickLanguageBtn(){
        languageBtn.click();
    }

    public void clickSpanishLanguageBtn(){
        spanishLanguageBtn.click();
    }

    public void clickAcceptCookiesBtn(){
        acceptCookiesBtn.click();
    }

    public void clickLanguageBtnOnSpanishPage(){
        languageBtnOnSpanishPage.click();
    }

    public void searchUsLanguage(){
        languageSearchBar.type("United States");
    }

    public void clickEnglishLangBtn(){
        englishLangBtn.click();
    }

}
