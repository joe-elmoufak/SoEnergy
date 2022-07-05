package stepdefinitions;

import io.cucumber.java.en.Given;
import org.picocontainer.annotations.Inject;

public class SignIn {
    @Inject
    functions.SignIn signIn;

    @Given("I sign in using my account details")
    public void iSignInUsingMyAccountDetails() {
        signIn.signIn();
    }
}
