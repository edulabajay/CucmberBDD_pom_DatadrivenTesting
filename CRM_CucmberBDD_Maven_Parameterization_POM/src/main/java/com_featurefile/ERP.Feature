Feature: CRM Test

  Scenario Outline: Free CRM Login and Add Contact Test Scenario
    Given User should be on login page
    When Title of login page is Free CRM
    Then User enters "<user_email>" and "<user_password>"
    Then User clcik on login button
    And User should be on home page
    Then user will click on create conatct button
    Then user enters "<user_first name>" and "<user_middle name>" and "<user_last name>" and "<user_company name>"
    Then user click on save button
    Then close the browser
