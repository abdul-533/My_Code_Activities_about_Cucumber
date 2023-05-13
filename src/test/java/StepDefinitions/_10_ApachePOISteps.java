package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _10_ApachePOISteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("User Create citizenship with ApacehPOI")
    public void userCreateCitizenshipWithApacehPOI() {
        ArrayList<ArrayList<String>> tablo =
                ExcelUtility.getData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx", "testCitizen", 2);

        for (ArrayList<String> satir : tablo) {
            ln.clickFunction(dc.addButton);
            ln.sendKeysFunction(dc.nameInput, satir.get(0));
            ln.sendKeysFunction(dc.shortNameInput, satir.get(1));
            ln.clickFunction(dc.saveButton);
            ln.verifyContainsTextFunction(dc.succesmsg, "success");
        }
    }

    @Then("User Delete citizenship with ApacehPOI")
    public void userDeleteCitizenshipWithApacehPOI() {
        ArrayList<ArrayList<String>> tablo =
                ExcelUtility.getData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx", "testCitizen", 1);

        for (ArrayList<String> satir : tablo) {
            dc.deleteItem(satir.get(0));
            dc.verifyContainsTextFunction(dc.succesmsg, "success");
        }
    }
}
