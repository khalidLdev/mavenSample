Feature: Login page automation

  Scenario: check login is successful with valid credentials
    Given user is on login
    When user unter valid username and password
    And clicks on button
    Then user is nagivated to home page
    And close the browser
