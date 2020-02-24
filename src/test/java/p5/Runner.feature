Feature: Search a Product

  Scenario: Search Product
    Given Alex logins in testMeApp
    And goto search 
    When he types 4 characters
    Then results displayed
    
 