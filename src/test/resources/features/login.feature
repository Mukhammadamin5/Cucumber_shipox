Feature: Shipox login feature

@t
  Scenario: Login as a user
    Given user is on the shipox login page
    When user enters username
    And user enters password
    Then user should click on signInBtn