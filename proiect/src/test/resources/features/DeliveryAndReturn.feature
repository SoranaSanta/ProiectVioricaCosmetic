@viorica
Feature: Delivery and Return
@viorica3
  Scenario: User clicks delivery and return button and a popup containg the right information appears
    Given the user opens the browser
      And the user navigates to the homepage
      And the user accepts cookies 
      And the user closes newsletter popup
    When the user chooses the first best-seller product
      And the user opens the delivery and return popup
    Then the correct information is displayed
      And the user closes the browser