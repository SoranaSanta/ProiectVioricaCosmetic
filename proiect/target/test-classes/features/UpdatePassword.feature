@viorica
Feature: Update password
@viorica4
  Scenario: User updates their password successfully
    Given the user opens the browser
      And the user navigates to the edit account page
      And the user accepts cookies 
      And the user closes newsletter popup
    When the user logins
      And the user completes all the necessary fields
    Then the password is updated successfully
      And the user closes the browser