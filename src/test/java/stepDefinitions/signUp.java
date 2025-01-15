package stepDefinitions;

import commands.signUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class signUp {

    signUpPage signUpPage = new signUpPage();

    @Given("I input new user data at pre signup page")
    public void inputNewUserPreSignUpData() {
        signUpPage.preSignUpDataInput();
    }

    @Then("I enter user data for account creation")
    public void inputUserDataForAccountCreation() {
        signUpPage.enterAccountInformation();
    }

    @And("Verify account created successfully")
    public void verifyAccountCreatedSuccessfully() {
        signUpPage.verifyAccountCreatedSuccessfully();
    }
}
