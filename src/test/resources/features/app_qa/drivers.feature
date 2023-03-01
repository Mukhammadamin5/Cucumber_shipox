Feature: Create Driver
@w
  Scenario: User should create Driver
    Given user  setUps
    When user is on the Create Driver page
    And user completes all the fields
    Then user clicks on btn
