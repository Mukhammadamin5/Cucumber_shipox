Feature: Create Order
@w
  Scenario: user creates order
    Given user setUps3
    When user is on the Create Order page
    And user completes all the fields3
    Then user clicks on Btn3