package stepdefinitions;

import io.cucumber.java.en.Given;
import org.picocontainer.annotations.Inject;

import java.text.ParseException;

public class ShoppingBasket {
    @Inject
    functions.ShoppingBasket checkout;

    @Given("I increase the quantity of products by 1 from the checkout screen")
    public void iIncreaseTheQuantityOfProductsToFromTheCheckoutScreen() throws ParseException, InterruptedException {
        checkout.changeQuantityOfProduct();
        checkout.proceedToCheckout();
    }
}
