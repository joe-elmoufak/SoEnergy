package stepdefinitions;

import io.cucumber.java.en.Given;
import org.picocontainer.annotations.Inject;

public class Homepage {
    @Inject
    functions.Homepage homepage;

    @Given("I navigate to the Homepage")
    public void user_is_on_login_page() {
        homepage.gotoHomePage();
    }
}
