package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//burda en basit raporu alicaz  Plugin diye satir ekleyerek yapilir


@CucumberOptions( tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"
        },
        glue = {"StepDefinitions"},
        plugin= {"html:target/site/cucumber-pretty.html"} // basit rabor basic diye gecer ismi iceride verdiyimizde yeri nereye aticaqi
)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
