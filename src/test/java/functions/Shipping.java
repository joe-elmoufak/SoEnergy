package functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ChromeDriverWrapper;

public class Shipping {

    @FindBy(css = "#cgv")
    WebElement shippingTermsCheckbox;

    @FindBy(css = "button[name='processCarrier'] span")
    WebElement proceedToPayment;

    @FindBy(css = "#total_price")
    WebElement totalPrice;

    @FindBy(css = "p[class='product-name'] a")
    WebElement productName;

    private final ChromeDriver chromeDriverWrapper;

    public Shipping(ChromeDriverWrapper chromeDriverWrapper) {
        this.chromeDriverWrapper = chromeDriverWrapper.get();
        PageFactory.initElements(chromeDriverWrapper.get(), this);
    }

    public void acceptShippingTermsAndProceed() {
        shippingTermsCheckbox.click();
        proceedToPayment.click();
        System.out.println("TOTAL PRICE === " + totalPrice.getText());
        System.out.println("PRODUCT NAME === " + productName.getText());
    }
}