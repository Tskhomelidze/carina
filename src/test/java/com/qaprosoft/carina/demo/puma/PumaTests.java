package com.qaprosoft.carina.demo.puma;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.puma.Puma;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.puma.PumaPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.annotations.Test;

public class PumaTests implements IAbstractTest, IMobileUtils {
    @Test
    public void pumaTest(){
        PumaPageBase puma = new PumaPageBase(getDriver());
        puma.open();
    }
}
