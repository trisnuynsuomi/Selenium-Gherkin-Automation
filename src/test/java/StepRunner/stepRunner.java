package StepRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature", glue = {"stepDefinitions"})
public class stepRunner extends AbstractTestNGCucumberTests {
}
