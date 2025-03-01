@viorica
Feature: Add product to cart
@viorica2
  Scenario: User adds to the cart the first product from the "Creme" category
    Given the user opens the browser
      And the user navigates to the Creme page
      And the user accepts cookies 
      And the user closes newsletter popup
    When the user chooses the first product
      And the user adds the product to the cart 
    Then the correct product name and price will be displayed in the cart
      And the user closes the browser