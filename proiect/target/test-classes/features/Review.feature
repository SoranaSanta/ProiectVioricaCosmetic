@viorica
Feature: Add a product review
@viorica5
  Scenario: User is not able to add a review for a product without score
    Given the user opens the browser
      And the user navigates to the homepage
      And the user accepts cookies 
      And the user closes newsletter popup
    When the user finds the product using the search box
      And the user opens the review popup
      And the user completes the message and leaves score empty
    Then the review is not added and error message appears
      And the user closes the browser