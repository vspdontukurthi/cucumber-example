Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5
    When I add 2 and 2
    Then the result should be 4
    When I add 3 and 2
    Then the result should be 4
