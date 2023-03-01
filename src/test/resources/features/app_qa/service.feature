Feature: Create service
  @w
  Scenario: user creates service
    Given user setUps2
    When user is on the Create Service page
    And user completes all the fields2
    Then user clicks on btn2