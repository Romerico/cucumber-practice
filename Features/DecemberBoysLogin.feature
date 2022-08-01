Feature: Simple Login

  Scenario: Login with valid credentials
    Given I launch chrome browser
    When I open DecemberBoys login page
    And pass valid credentials
    And click login
    Then I verify that I'm logged in
    And close browser