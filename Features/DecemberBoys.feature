Feature: DecemberBoys Login

  Scenario: Logo presence on DecemberBoys homepage
    Given I launch chrome browser
    When I open DecemberBoys homepage
    Then I verify that the logo is present on a homepage
    And close browser



