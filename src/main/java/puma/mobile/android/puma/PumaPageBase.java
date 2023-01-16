package puma.mobile.android.puma;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class PumaPageBase extends AbstractPage implements IMobileUtils {
    public PumaPageBase(WebDriver driver) {
        super(driver);
    }
}
