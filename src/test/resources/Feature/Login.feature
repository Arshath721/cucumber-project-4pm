@LoginFuntion
Feature: To validate FB using different credentials

  @sanity
  Scenario Outline: To validate using different credentials
    Given User must be in FB login page
    When User enter values to the emailfield "<emailfield>" and passwordfield "<passwordfield>"
    And User clicked login btn
    Then User validate and quit the browser

    Examples: 
      | emailfield       | passwordfield |
      | greens@gmail.com | Greens@123    |
      | java@gmail.com   | Java@123      |
      | python@gmail.com | Python@123    |
