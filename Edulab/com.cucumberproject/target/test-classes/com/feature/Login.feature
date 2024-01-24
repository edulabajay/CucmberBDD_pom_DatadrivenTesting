
Feature: Gujarat university 

  @tag1
  Scenario: login Feature
    Given user should be on Login Page
    When user Enter email address and password
    Then user click on login button

 #@tag2
 # Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples:   
     #| name  | value | status  |
     #| name1 |     5 | success |
     #| name2 |     7 | Fail    |