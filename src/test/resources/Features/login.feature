Feature: Login page automation

  Scenario: check login is successful with valid credentials
    Given user is on login
    When user unter valid username and password
    And clicks on button
    Then user is nagivated to home page
    And close the browser

  Scenario: Access Home Page as a Guest
    Given the user is not logged in
    When the user accesses the home page
    Then the user should see the main banner
    And the user should see a brief introduction to the site

  Scenario: View About Us Page
    Given the user is not logged in
    When the user navigates to the "About Us" section
    Then the user should see information about the company
    And the user should see the mission and vision statements

  Scenario: Browse Products or Services
    Given the user is not logged in
    When the user explores the product or service offerings
    Then the user should see a list of available products or services
    And the user should be able to view details of each item

  Scenario: Search Functionality
    Given the user is not logged in
    When the user uses the search feature
    Then the user should see relevant search results
    And the user should be able to navigate to specific content

  Scenario: View Latest News or Blog Posts
    Given the user is not logged in
    When the user checks the latest news or blog posts section
    Then the user should see a list of recent articles
    And the user should be able to click on an article to read more

  Scenario: Access Contact Information
    Given the user is not logged in
    When the user looks for contact information
    Then the user should see details such as address, phone number, and email
    And the user should be able to use this information to contact support

  Scenario: Sign Up for Newsletter
    Given the user is not logged in
    When the user subscribes to the newsletter
    Then the user should receive a confirmation message
    And the user should start receiving newsletters on a regular basis

  Scenario: Access FAQ Section
    Given the user is not logged in
    When the user visits the FAQ (Frequently Asked Questions) page
    Then the user should find answers to common queries
    And the user should be able to search for specific questions

  Scenario: View Promotions or Special Offers
    Given the user is not logged in
    When the user checks for promotions or special offers
    Then the user should see current deals or discounts
    And the user should be able to click through to learn more details
