package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _11_JDBCSteps {
    LeftNav ln = new LeftNav();

    @Then("Send the  query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorqu) {
        //DB den gerekli bilgileri alalim
        ArrayList<ArrayList<String>> dbList = DBUtility.getListData(sorqu);
        //UI dan ekrandaki bilgileri alicam
        //UI dan gerekli bilgileri aldik
        DialogContent dc = new DialogContent();
        List<WebElement> UIList = dc.nameList;


        for (int i = 0; i < dbList.size(); i++) {
            System.out.print(dbList.get(i).get(1).trim());
            System.out.println("\t" + UIList.get(i).getText().trim());

            Assert.assertEquals(dbList.get(i).get(1).trim(),
                    UIList.get(i).getText().trim()

            );
        }

    }
}
