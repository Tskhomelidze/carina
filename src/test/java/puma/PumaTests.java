package puma;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestRailCaseId;
import com.zebrunner.agent.core.registrar.TestRail;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import puma.base.*;

public class PumaTests implements IAbstractTest,IMobileUtils {

    @BeforeSuite
    public void setUp() {
        TestRail.setSuiteId("S187");
        TestRail.setRunName("Puma web tests.");
        TestRail.setAssignee("Luka");
    }

    @TestRailCaseId("C3531")
    @Test
    public void CartTest(){
        CartBase cart = initPage(getDriver(),CartBase.class);
        cart.open();
        cart.closePopUps();
        cart.clickMenBtn();
        cart.clickClassicsBtn();
        cart.refresh(1);
        cart.selectProduct();
        cart.selectSize();
        cart.clickAddToCart();
        Assert.assertTrue(cart.isPageOpened(), "Error, page is not opened");
    }

    @TestRailCaseId("C3532")
    @Test
    public void formTest(){
        FormBase form = initPage(getDriver(), FormBase.class);
        form.open();
        form.closePopUps();
        form.clickDigitalGiftBtn();
        form.clickSelectValue();
        form.typeRecipientName("a Recipient name");
        form.typeYourName("My name");
        form.typeRecipientEmail("RecipientEmail@gmail.com");
        form.typeGiftMessage("It's a gift from Santa!");
        form.clickAddToCartBtn();
        Assert.assertTrue(form.isPageOpened(),"Error, page is not opened");
    }

    @TestRailCaseId("C3533")
    @Test
    public void hoverTest(){
        HoverBase hover = initPage(getDriver(), HoverBase.class);
        hover.open();
        hover.closePopUps();
        hover.clickSportBtn();
        hover.clickShopAllTrainingBtn();
        hover.refresh(1);
        hover.printAllProducts();
        Assert.assertTrue(hover.isPageOpened(),"Error, Product list is empty");
    }

    @TestRailCaseId("C3534")
    @Test
    public void languageTest() {
        LanguageBase language = initPage(getDriver(),LanguageBase.class);
        language.open();
        language.closePopUps();
        language.clickMenuBar();
        language.clickLanguageBtn();
        language.clickSpanishLanguageBtn();
        language.clickAcceptCookiesBtn();
        language.clickLanguageBtnOnSpanishPage();
        language.searchUsLanguage();
        language.clickEnglishLangBtn();
        Assert.assertTrue(language.isPageOpened(),"Error, page is not opened");
    }

    @TestRailCaseId("C3535")
    @Test
    public void searchTest(){
        SearchBarBase searchBar = initPage(getDriver(),SearchBarBase.class);
        searchBar.open();
        searchBar.closePopUps();
        searchBar.search("TRAINING");
        searchBar.refresh(1);
        searchBar.printAllItemInfo();
        Assert.assertTrue(searchBar.isPageOpened(),"Error, Product list is empty");
    }

}