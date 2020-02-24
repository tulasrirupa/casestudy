Feature: scenario_outline

  Scenario Outline: Title of your scenario outline
     Given User navigates to URL
    And enters "<username>" and  "<password>"
    When click on signup button
    Then welcome page is displayed
    
    Examples: 
      | username | password| 
      | lalitha |     saws | 
      | sri |     4fdv7 | 
      | japan| korea|
      | china| dubai|
