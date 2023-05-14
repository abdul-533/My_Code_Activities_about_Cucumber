package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  //tags = "@Regression",
        tags = "@Regression or @SmokeTest",//->boyle olunca ikisinde calioshtirir
        //tags =  "@SmokeTest" and "@Regression" ,-> boyle olunca ise bu iki tagda olanlari calishtiricak yani iki etiketli olanlar calishtiricak

// yani bunlarin icinde smokeTest olanlari calsihtir
        // tumu icin bulunduklari klasoru verdim
        //boylece butunu calioshicak regretion test gibi
        features = {"src/test/java/FeatureFiles"

        },
        glue = {"StepDefinitions"},
        plugin= {"html:target/site/cucumber-pretty.html"}
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
