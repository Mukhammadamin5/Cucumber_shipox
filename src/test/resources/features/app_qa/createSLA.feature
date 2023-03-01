Feature: Create SLA
@w
  Scenario: user creates SLA
    Given user setUps1
    When user is on the Create SLA page
    And user completes all the fields1
    Then user clicks on Btn