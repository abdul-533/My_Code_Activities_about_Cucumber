package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_4_CitizenshipSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("Navigate to CitizenShip page")
    public void navigateToCitizenShipPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.citizenShip);
    }

    @When("User a citizenShip name as {string} shortname as {string}")
    public void createACitizenshipNameAsShortnameAs(String name, String shortName) {
        ln.clickFunction(dc.addButton);
        ln.sendKeysFunction(dc.nameInput, name);
        ln.sendKeysFunction(dc.shortNameInput, shortName);
        ln.clickFunction(dc.saveButton);


    }


    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.existMsg, "already exists");
    }

    @When("User delete the {string}")
    public void userDeleteThe(String searchText) {
        dc.deleteItem(searchText);


    }
}
