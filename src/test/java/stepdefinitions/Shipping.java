package stepdefinitions;

import io.cucumber.java.en.Given;
import org.picocontainer.annotations.Inject;

public class Shipping {
    @Inject
    functions.Shipping shipping;

    @Given("I accept the shipping terms and proceed to payment")
    public void iAcceptTheShippingTermsAndProceedToPayment() {
        shipping.acceptShippingTermsAndProceed();
    }
}
