package stepdefinitions;

import io.cucumber.java.en.Given;
import org.picocontainer.annotations.Inject;

public class AddressConfirmation {
    @Inject
    functions.AddressConfirmation addressConfirmation;

    @Given("I confirm my shipping and billing address is correct")
    public void iConfirmMyShippingAndBillingAddressIsCorrect() {
        addressConfirmation.confirmAddressInformationAndProceed();
    }
}
