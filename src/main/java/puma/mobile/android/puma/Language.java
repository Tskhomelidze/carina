package puma.mobile.android.puma;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PumaPageBase.class)
public class Language extends PumaPageBase{

    @FindBy(xpath = "//li[@class='py-2']")
    ExtendedWebElement languageBtn;

    @FindBy(xpath = "//a[@hreflang='es-es']")
    ExtendedWebElement spanishLanguageBtn;

    @FindBy(id = "onetrust-accept-btn-handler")
    ExtendedWebElement acceptCookiesBtn;

    @FindBy(xpath = "//a[@data-js-change-locale]")
    ExtendedWebElement languageBtnOnSpanishPage;

    @FindBy(xpath = "//input[@id='locale-search-input']")
    ExtendedWebElement languageSearchBar;

    @FindBy(xpath = "//a[@data-locale='en_US']")
    ExtendedWebElement englishLangBtn;

    public Language(WebDriver driver) {
        super(driver);
    }

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

    @Override
    public boolean isPageOpened() {
        return menuBar.isElementPresent();
    }
}
