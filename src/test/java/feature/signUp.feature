Feature: Verify sign up function

  Background: Open Browser
    Given I want to open Browser

  Scenario Outline: Verify sign up for new users
    Given I navigate to "<page>"
    Given I input new user data at pre signup page
    Then I enter user data for account creation
    And Verify account created successfully
    And I want to close Browser
    Examples:
      | page           |
      | Signup / Login |
