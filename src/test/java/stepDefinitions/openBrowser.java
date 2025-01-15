package stepDefinitions;

import baseCommand.baseCommand;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class openBrowser {
    baseCommand baseCommand = new baseCommand();

    @Given("I want to open Browser")
    public void openDriver() {
        baseCommand.openDriver();
    }

    @And("I want to close Browser")
    public void closeBrowser() {
        baseCommand.closeBrowser();
    }

}
