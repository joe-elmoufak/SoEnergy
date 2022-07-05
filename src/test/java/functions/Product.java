package functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ChromeDriverWrapper;

import static org.junit.Assert.assertTrue;

public class Product {
    @FindBy(xpath = "//*[@class='product_list row list']")
    WebElement listView;

    @FindBy(xpath = "//*[@class='product_list row grid']")
    WebElement gridView;

    @FindBy(id = "list")
    WebElement selectListView;

    @FindBy(id = "grid")
    WebElement selectGridView;

    @FindBy(xpath = "//a[contains(@class,'add_to_cart_button')]")
    WebElement addToCartButton;

    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    WebElement proceedToCheckout;

    private final ChromeDriver chromeDriverWrapper;

    public Product(ChromeDriverWrapper chromeDriverWrapper) {
        this.chromeDriverWrapper = chromeDriverWrapper.get();
        PageFactory.initElements(chromeDriverWrapper.get(), this);
    }

    public void selectProductView(String viewType) throws InterruptedException {
        if (viewType.toLowerCase() == "grid") {
            selectGridView.click();
            assertTrue(gridView.isDisplayed());
        } else {
            selectListView.click();
            assertTrue(listView.isDisplayed());
        }
    }

    public void  addProductToBasket() {
        addToCartButton.click();
    }

    public void proceedToCheckout() {
        proceedToCheckout.click();
    }
}
