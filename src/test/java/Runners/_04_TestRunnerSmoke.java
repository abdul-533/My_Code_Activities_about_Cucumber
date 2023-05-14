package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // yani bunlarin icinde smokeTest olanlari calsihtir
        // tumu icin bulunduklari klasoru verdim
        //boylece butunu calioshicak regretion test gibi
        features = {"src/test/java/FeatureFiles"

        },
        glue = {"StepDefinitions"},
        plugin= {"html:target/site/cucumber-pretty.html"}
        //plugin normalde yok, jenkins için ekleniyor
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
