@tag
Feature: checkout

  @tag1
  Scenario Outline: : check login is successful with valid credentials
    Given user is on login
    When user unter valid <username> and <password>
    And clicks on button
    Then user is nagivated to home page

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |

  Scenario: checkout is successful
    Given user is on the inventory page
    When user add one or lot of products
    And clicks on add to cart
    And clicks on cart icon
    And clicks on checkout
    Given use add valid costumer informations
    And clicks on continue
    And clicks on finish
    Then have a confirmation message
