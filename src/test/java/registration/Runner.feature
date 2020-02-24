Feature: TestMeApp Registration

  Scenario: Successul Registration
    Given User clicks on signup button
    And enters username as "tulasri12"
    And enters first name as "tula"
    And enters last name as "sri"
    And enters password as "tula123"
    And enters confirm password as "tula123"
    And clicks on gender female radio button
    And enters email as "tsri@gmail.com"
    And enters mobile number as {12345678}
    And enters dob as "1-2-2022"
    And enters address as "coimbatore"
    And selects security question clicks
    And enters answer as "blue"
    When click on register button
    Then welcome page is displayed
