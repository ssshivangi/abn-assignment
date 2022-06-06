Feature: Automate Home page Tests
Description: The purpose of this feature is to test Home page of ABN AMRO web application.

  Scenario Outline: User Log in to ABN AMRO application with '<role>'
    Given User loads the application
    When Login in with user "<role>"
    Then Verify if home page displayed for signed in user
    And Verify if home page contains correct content
    And Logout from ABN AMRO application

    Examples:
      | role                          |
      | admin                         |
      | normalUser-Biancunha          |
      | normalUser-growdev            |

  Scenario: User name displayed on Home page
    Given User loads the application
    When Login in with user "normalUser-Biancunha"
    Then Verify if correct user name displays on Home page
    And Logout from ABN AMRO application

  Scenario: Verify
    Given User loads the application
    When Login in with user "normalUser-Biancunha"
    Then Verify if correct user name displays on Home page
    And Logout from ABN AMRO application

    