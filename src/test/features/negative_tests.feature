Feature: Automate Negative scenarios
  Description: The purpose of this feature is to test negative scenarios of ABN AMRO web application.

  Scenario Outline: Verify error scenarios
    Given User loads the application
    When Error case- Login in with user "<specificCase>"
    Then Verify the error message for "<specificCase>"

    Examples:
      | specificCase                  |
      | invalid email Id              |
      | user incorrect credentials    |