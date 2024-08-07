@Tag
Feature: select product

  Scenario: check login is successful with valid credentials
    Given user is on login
    When user unter valid username and password
    And clicks on button
    Then user is nagivated to home page

  Scenario: check add to cart is successful after login
    Given user is on the inventory page
    When user select a product
    Then the product is added to the cart
    And delete product from cart page
    And back to shopping
