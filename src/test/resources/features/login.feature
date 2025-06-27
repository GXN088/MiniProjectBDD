Feature: Login

  Scenario: Successful login
    Given I open the login page
    When I enter username "tomsmith" and password "SuperSecretPassword!"
    Then I should see the success message
