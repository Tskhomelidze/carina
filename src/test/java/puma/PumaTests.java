package puma;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import puma.mobile.android.puma.*;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PumaTests implements IAbstractTest,IMobileUtils {
    @Test
    public void cartTest(){
        Cart cart = new Cart(getDriver());
        cart.open();
        cart.clickCloseMobileAppBtn();
        cart.clickStayOnUsBtn();
        cart.clickMenuBar();
        cart.clickMenBtn();
        cart.clickShoesBtn();
        cart.clickClassicsBtn();
        cart.refreshPage();
        cart.clickCloseCookiesBtn();
        cart.clickCloseSaleBtn();
        cart.selectProduct();
        cart.selectSize();
        cart.clickAddToCart();
        Assert.assertTrue(cart.isPageOpened(),"Error, page is not opened");
    }

    @Test
    public void formTest(){
        Form form = new Form(getDriver());
        form.open();
        form.clickStayOnUsBtn();
        form.clickCloseCookiesBtn();
        form.clickCloseSaleBtn();
        form.clickDigitalGiftBtn();
        form.clickSelectValue();
        form.typeRecipientName("a Recipient name");
        form.typeYourName("My name");
        form.typeRecipientEmail("RecipientEmail@gmail.com");
        form.typeGiftMessage("It's a gift from Santa!");
        form.clickAddToCartBtn();
        Assert.assertTrue(form.isPageOpened(),"Error, page is not opened");
    }

    @Test
    public void hoverTest(){
        Hover hover = new Hover(getDriver());
        hover.open();
        hover.clickCloseMobileAppBtn();
        hover.clickStayOnUsBtn();
        hover.clickCloseCookiesBtn();
        hover.clickCloseSaleBtn();
        hover.clickMenuBar();
        hover.clickSportBtn();
        hover.clickTrainingBtn();
        hover.clickShopAllTrainingBtn();
        hover.refreshPage();
        hover.printAllProducts();
        Assert.assertTrue(hover.isPageOpened(),"Error, page is not opened");
    }

    @Test
    public void languageTest() {
        Language language = new Language(getDriver());
        language.open();
        language.clickCloseMobileAppBtn();
        language.clickStayOnUsBtn();
        language.clickCloseCookiesBtn();
        language.clickMenuBar();
        language.clickLanguageBtn();
        language.clickSpanishLanguageBtn();
        language.clickAcceptCookiesBtn();
        language.clickLanguageBtnOnSpanishPage();
        language.searchUsLanguage();
        language.clickEnglishLangBtn();
        Assert.assertTrue(language.isPageOpened(),"Error, page is not opened");
    }

    @Test
    public void searchTest(){
        SearchBar searchBar = new SearchBar(getDriver());
        searchBar.open();
        searchBar.clickCloseMobileAppBtn();
        searchBar.clickStayOnUsBtn();
        searchBar.clickCloseCookiesBtn();
        searchBar.clickSearchIcon();
        searchBar.search("TRAINING");
        searchBar.refreshPage();
        searchBar.printAllItemInfo();
        Assert.assertTrue(searchBar.isPageOpened(),"Error, page is not opened");
    }

}
