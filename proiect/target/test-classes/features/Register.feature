@viorica
Feature: Create a new account
@viorica1
  Scenario: User is able to create a new account with valid credentials
    Given the user opens the browser
      And the user navigates to the homepage
      And the user accepts cookies 
      And the user closes newsletter popup
    When the user opens the login popup
      And the user opens the register form
      And the user completes all the mandatory fields
    Then the new account is created
      And the user closes the browser