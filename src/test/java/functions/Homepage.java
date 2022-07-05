package functions;

import org.openqa.selenium.support.PageFactory;
import utils.ChromeDriverWrapper;

public class Homepage {
    private ChromeDriverWrapper chromeDriverWrapper;

    public Homepage(ChromeDriverWrapper chromeDriverWrapper) {
        this.chromeDriverWrapper = chromeDriverWrapper;
        PageFactory.initElements(chromeDriverWrapper.get(), this);
    }

    public void gotoHomePage() {
        chromeDriverWrapper.get().navigate().to("http://automationpractice.com/index.php");
    }
}
