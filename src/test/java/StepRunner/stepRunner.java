package StepRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature", glue = {"stepDefinitions"}, plugin = {"pretty", "html:target/cucumber-reports.html"})
public class stepRunner extends AbstractTestNGCucumberTests {
}
