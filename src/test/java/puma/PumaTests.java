package puma;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import puma.mobile.android.puma.Cart;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PumaTests implements IAbstractTest,IMobileUtils {
    @Test
    public void cartTest(){
        Cart cart = new Cart(getDriver());
        cart.open();
        cart.clickCloseMobileAppBtn();
        cart.clickCloseLocationBtn();
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

}
