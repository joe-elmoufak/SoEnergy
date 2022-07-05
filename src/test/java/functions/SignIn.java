package functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ChromeDriverWrapper;

public class SignIn {
    private final ChromeDriver chromeDriverWrapper;

    @FindBy(id = "SubmitLogin")
    WebElement submitLogin;

    @FindBy(css = "#email")
    WebElement emailAddress;

    @FindBy(css = "#passwd")
    WebElement password;

    public SignIn(ChromeDriverWrapper chromeDriverWrapper) {
        this.chromeDriverWrapper = chromeDriverWrapper.get();
        PageFactory.initElements(chromeDriverWrapper.get(), this);
    }

    public void signIn() {
        emailAddress.sendKeys("blah111@blah.com");
        password.sendKeys("blah111");
        submitLogin.click();
    }
}
