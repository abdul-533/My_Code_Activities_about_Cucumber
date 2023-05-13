package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Hooks {

    @After // cucumber otomotik kendisi ishleme sliyor
    public void after(Scenario senaryo) { //her senaryodan sonra calishir
        System.out.println("Senaryo bitdi");
        https:
//www.programsbuzz.com/article/how-add-screenshot-cucumber-extent-report-every-step   bunlar bu sitede var

        ExcelUtility.writeExcel("src/test/java/ApachePOI/resource/ScenarioStatus.xlsx",
                senaryo,GWD.threadBrowserGet());

if (senaryo.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) GWD.getDriver();
            final byte[] jafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(jafizadakiHali, "image/png", "screenshot name");

        }


        GWD.quitDriver();

    }
}
