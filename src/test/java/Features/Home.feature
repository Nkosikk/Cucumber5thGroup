@Regression @Home
Feature: Home

  Scenario Outline: As a user i want to add item to the cart
    Given The user is in login page
    And The user enters username <username>
    And The user enters password <password>
    When The user clicks login button
    Then Home page is displayed
    And The user click SauceLAb Back Pack
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |