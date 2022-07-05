package stepdefinitions;

import io.cucumber.java.en.Given;
import org.picocontainer.annotations.Inject;

public class Product {
    @Inject
    functions.Product product;

    @Given("I view the products on the page using the {string} view")
    public void iViewTheProductsOnThePageUsingTheView(String viewType) throws InterruptedException {
        product.selectProductView(viewType);
        product.addProductToBasket();
        product.proceedToCheckout();
    }
}
