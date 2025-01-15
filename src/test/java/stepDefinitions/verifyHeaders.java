package stepDefinitions;

import commands.homePage;
import io.cucumber.java.en.Given;

public class verifyHeaders {
    homePage homePage = new homePage();

    @Given("Admin verify {string} headers is visible")
    public void adminVerifyHeaders(String header) {
        homePage.verifyHeaders(header);
    }
}
