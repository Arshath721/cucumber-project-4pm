@FacebookLogin
Feature: To validate the facebook funtionality

  Background: 
    Given User must be in facebook login page

  @smoke 
  Scenario: To validate using invalid username and invalid password
    When User enter invalid username and invalid password
      | usernameKey | emailKey         | passKey    | phnoKey    |
      | Greens      | greens@gmail.com | Greens@123 | 9876543210 |
      | Java        | Java@gmail.com   | Java@123   | 8765432109 |
      | Python      | Python@gmail.com | Python@123 | 7654321098 |
    And User click login button
    Then User must be in invalid page

  @sanity @regression
  Scenario: To validate forgot password functionality
    When User click forgot password link
    And User enter value to text feild and click search button
    Then User must be in identify your account page
