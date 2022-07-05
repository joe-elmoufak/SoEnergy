package functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ChromeDriverWrapper;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class ShoppingBasket {

    @FindBy(xpath = "//*[@id=\"product_price_5_19_0\"]/span[1]")
    WebElement priceAfterDiscount;

    @FindBy(xpath = "//*[@id=\"total_price\"]")
    WebElement totalPrice;

    @FindBy(xpath = "//*[@id=\"cart_quantity_up_5_19_0_0\"]")
    WebElement increaseQuantity;

    @FindBy(css = "td[class='cart_description'] p[class='product-name'] a")
    WebElement productName;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    WebElement proceedToCheckoutButton;

    private final ChromeDriver chromeDriverWrapper;

    public ShoppingBasket(ChromeDriverWrapper chromeDriverWrapper) throws ParseException {
        this.chromeDriverWrapper = chromeDriverWrapper.get();
        PageFactory.initElements(chromeDriverWrapper.get(), this);
    }

    public void changeQuantityOfProduct() throws ParseException, InterruptedException {
        NumberFormat nf = new DecimalFormat("$#,###.00");
        double unitPrice = nf.parse(priceAfterDiscount.getText()).doubleValue();
        double grandTotal = nf.parse(totalPrice.getText()).doubleValue();
        double expectedNewTotal = unitPrice + grandTotal;
        System.out.println(expectedNewTotal);
        increaseQuantity.click();
        Thread.sleep(10000);
        assertEquals(expectedNewTotal, nf.parse(totalPrice.getText()).doubleValue(), 0);
    }
    public void proceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}
