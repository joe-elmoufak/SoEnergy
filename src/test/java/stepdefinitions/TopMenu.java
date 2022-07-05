package stepdefinitions;

import io.cucumber.java.en.Given;
import org.picocontainer.annotations.Inject;

public class TopMenu {
    @Inject
    functions.TopMenu topMenu;

    @Given("I click the summer dresses link from the dresses sub menu")
    public void iClickTheLinkFromTheSubMenu() {
        topMenu.select_linkFromMenu();
    }
}