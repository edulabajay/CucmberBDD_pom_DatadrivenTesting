Feature: login and create contact Test in CRM

  Scenario Outline: Free CRM Login Test Scenario
    Given User should be on the login page
    Then User enters "<user_input>" and "<pass_input>"
    And User clicks on the login button
    And User clicks on the create contact button
    And User enters "<first_name>", "<middle_name>", "<last_name>", and "<company_name>"
    And User clicks on the save button
    Then close the browser

    Examples: 
      | user_input                  | pass_input | first_name | middle_name | last_name | company_name    |
      | ajaybalajikadam69@gmail.com | edulab321  | A          | edulab      | kamle     | edulab exchange |
      | ajaybalajikadam69@gmail.com | edulab321  | B          | erp         | madne     | edulab exchange |
      | test@gmail.com              | edulab321  | C          | erpo        | divekar   | edulab exchange |
