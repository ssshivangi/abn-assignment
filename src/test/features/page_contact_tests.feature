Feature: Automate Contact page Tests
  Description: The purpose of this feature is to test Contact page of ABN AMRO web application.

  Scenario: Verify FAQs on the Contact page
    Given User loads the application
    When Login in with user "normalUser-growdev"
    Then Verify if home page displayed for signed in user
    When User navigates to "Contact page"
    Then Verify if the appropriate FAQ are listed
    Then Logout from ABN AMRO application

  Scenario: Verify email Id and phone number on the Contact page
    Given User loads the application
    When Login in with user "normalUser-Biancunha"
    Then Verify if home page displayed for signed in user
    When User navigates to "Contact page"
    Then Verify if Email Ids are available
    And Verify if phone numbers are available
    Then Logout from ABN AMRO application