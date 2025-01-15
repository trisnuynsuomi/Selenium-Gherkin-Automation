package StepRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature",
        glue = {"stepDefinitions"},
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class stepRunner extends AbstractTestNGCucumberTests {
}
