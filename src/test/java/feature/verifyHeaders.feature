Feature: Verify headers

  Background: Open Browser
    Given I want to open Browser

  Scenario Outline: Verify headers
    Given Admin verify "<header>" headers is visible
    And I want to close Browser
    Examples:
      | header          |
      | canhaumei               |
      | Home            |
      | Products        |
      | Cart            |
      | Signup / Login  |
      | Test Cases      |
      | API Testing     |
      | Video Tutorials |
      | Contact us      |

