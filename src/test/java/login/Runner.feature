Feature: login
 
  Scenario Outline: Successful Login
    Given I want to write a step with
    And i enter "<name>" and "<value>"
    When I check for the in step
    Then I verify the in step

    Examples: 
      | name    | value       |
      | lalitha | password123 |
