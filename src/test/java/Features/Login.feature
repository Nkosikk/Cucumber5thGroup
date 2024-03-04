@Regression @Login
Feature: Login

  Scenario Outline: As a user i want to login and verify that i am logged successfully
    Given The user is in login page
    And The user enters username <username>
    And The user enters password <password>
    When The user clicks login button
    Then Home page is displayed
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

