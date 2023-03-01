@w
Feature: Create Customer
  Background:
    Given user setUps

  Scenario: Click on Customer
    Given user is on the Create Customer page
    When user must complete all the fields
    Then user should click on Btn