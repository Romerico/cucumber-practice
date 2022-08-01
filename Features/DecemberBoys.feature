Feature: DecemberBoys Logo

  Scenario: Logo presence on DecemberBoys homepage
    Given I launch chrome browser
    When I open DecemberBoys homepage
    Then I verify that the logo is present on a homepage
    And close browser
#Login with valid credentials
  Scenario: Login with valid credentials
    Given I launch chrome browser
    When I open DecemberBoys login page
    And pass valid credentials
    And click login
    Then I verify that I'm logged in
    And close browser

#Login with valid credentials#2
  Scenario: Login with specific credentials
    Given I launch chrome browser
    When I open DecemberBoys login page
    And pass username "erg@rsgef.com" and password "123456789"
    And click login
    Then I verify that I'm logged in
    And close browser






