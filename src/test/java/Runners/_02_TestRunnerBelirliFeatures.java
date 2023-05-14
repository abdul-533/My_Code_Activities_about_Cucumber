package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = { // birden fazla yapicaz
                "src/test/java/FeatureFiles/_01_Login.feature", // bu 1 senaryo
                "src/test/java/FeatureFiles/_02_AddCountry.feature" // bu da iki ikisin ayni anda calishtirdik
        },
        glue = {"StepDefinitions"}



)
public class _02_TestRunnerBelirliFeatures extends AbstractTestNGCucumberTests {
}
