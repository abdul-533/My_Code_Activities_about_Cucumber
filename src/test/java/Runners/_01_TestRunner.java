package Runners;
// calishir hale gelmesi icin iki ishlem yapdik
//calishtirma ozelliyi olan biur clasi buraya extend edicez

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//parantez icine calioshicak olan bolumler yazilir...

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, // calsistiracaqimiz featurenin filenin yolunu vericez  feature filesin pathi verilecek
        glue = {"StepDefinitions"}  //steplerin olduqu kismi caloishtirir

)
public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
