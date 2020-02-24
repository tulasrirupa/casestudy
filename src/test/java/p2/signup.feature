Feature: signup

@uat
  Scenario: NewUser Signup
    Given User navigates to URL
    And enters "lalitha" and  123
    When click on signup button
    Then welcome page is displayed

     
  @unit  
    Scenario: Login Existing user
    Given User enters user name
    And user enters password
    When click on login button
    Then home page is displayed
    