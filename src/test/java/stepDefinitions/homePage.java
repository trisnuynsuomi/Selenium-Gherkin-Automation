package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class homePage {
    commands.homePage homePage = new commands.homePage();

    @Given("Admin verify {string} headers is visible")
    public void adminVerifyHeaders(String header) {
        homePage.verifyHeaders(header);
    }

    @Given("I navigate to {string}")
    public void navigateToPage(String page) {
        homePage.navigateToPage(page);
    }

    @Then("I want to logout")
    public void iWantToLogout() {
        homePage.logout();
    }
}
