package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
       // tumu icin bulunduklari klasoru verdim
        //boylece butunu calioshicak regretion test gibi
        features = {"src/test/java/FeatureFiles"

        },
        glue = {"StepDefinitions"},
        dryRun = true // ilave bu true olduqunda testi calioshtirmaz
        // sadece futureler varmi diye kontrol eder
        // asserte benzer sadece kontrol amacli


)
public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {
}
