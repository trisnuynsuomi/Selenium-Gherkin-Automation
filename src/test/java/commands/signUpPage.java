package commands;

import baseCommand.baseCommand;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Random;

public class signUpPage {
    baseCommand baseCommand = new baseCommand();
    Faker faker = new Faker();

    String signUpNameField = "[data-qa=\"signup-name\"]";
    String preSignUpEmailField = "[data-qa=\"signup-email\"]";
    String preSignUpButton = "[data-qa=\"signup-button\"]";
    String passwordField = "[data-qa=\"password\"]";
    String dayDropdown = "[data-qa=\"days\"]";
    String monthDropdown = "[data-qa=\"months\"]";
    String yearsDropdown = "[data-qa=\"years\"]";
    String firstNameField = "[data-qa=\"first_name\"]";
    String lastNameField = "[data-qa=\"last_name\"]";
    String companyField = "[data-qa=\"company\"]";
    String addressField = "[data-qa=\"address\"]";
    String countryDropdown = "[data-qa=\"country\"]";
    String stateField = "[data-qa=\"state\"]";
    String cityField = "[data-qa=\"city\"]";
    String zipcodeField = "[data-qa=\"zipcode\"]";
    String phoneField = "[data-qa=\"mobile_number\"]";
    String signUpButton = "[data-qa=\"create-account\"]";

    String accountCreatedBanner = "[data-qa=\"account-created\"]";
    String continueButton = "[data-qa=\"continue-button\"]";


    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();
    }

    // Data for pre-signup step
    String userName = faker.name().username();
    String email = getSaltString() + "@gmail.com";

    // Data for signup step
    final String password = "Password1";
    final String firstName = faker.name().firstName();
    final String lastName = faker.name().lastName();
    final String company = faker.company().name();
    final String address = faker.address().fullAddress();
    final String state = faker.address().state();
    final String city = faker.address().city();
    final String zipcode = faker.address().zipCode();
    final String phone = faker.phoneNumber().phoneNumber();

    public void preSignUpDataInput() {
        baseCommand.inputField(By.cssSelector(signUpNameField), userName);
        baseCommand.inputField(By.cssSelector(preSignUpEmailField), email);
        baseCommand.getElement(By.cssSelector(preSignUpButton)).click();
    }

    public void enterAccountInformation() {
        baseCommand.inputField(By.cssSelector(passwordField), password);
        baseCommand.selectDropdownOption(By.cssSelector(dayDropdown), "1");
        baseCommand.selectDropdownOption(By.cssSelector(monthDropdown), "January");
        baseCommand.selectDropdownOption(By.cssSelector(yearsDropdown), "2000");
        baseCommand.inputField(By.cssSelector(firstNameField), firstName);
        baseCommand.inputField(By.cssSelector(lastNameField), lastName);
        baseCommand.inputField(By.cssSelector(companyField), company);
        baseCommand.inputField(By.cssSelector(addressField), address);
        baseCommand.selectDropdownOption(By.cssSelector(countryDropdown), "India");
        baseCommand.inputField(By.cssSelector(stateField), state);
        baseCommand.inputField(By.cssSelector(cityField), city);
        baseCommand.inputField(By.cssSelector(zipcodeField), zipcode);
        baseCommand.inputField(By.cssSelector(phoneField), phone);
        baseCommand.getElement(By.cssSelector(signUpButton)).click();
    }

    public void verifyAccountCreatedSuccessfully() {
        Assert.assertTrue(baseCommand.getElement(By.cssSelector(accountCreatedBanner)).isDisplayed());
        baseCommand.getElement(By.cssSelector(continueButton)).click();
    }
}
