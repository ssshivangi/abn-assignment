Feature: Automate Products page Tests
  Description: The purpose of this feature is to test Products page of ABN AMRO web application.

  Scenario Outline: Verify user Products
    Given User loads the application
    When Login in with user "<role>"
    Then Verify if home page displayed for signed in user
    When User navigates to "Product page"
    Then All the products for the user "<role>" is displayed
    And User "<role>" can take required action for the product
    Then Logout from ABN AMRO application

    Examples:
      | role                          |
      | admin                         |
      | normalUser-Biancunha          |
      | normalUser-growdev            |