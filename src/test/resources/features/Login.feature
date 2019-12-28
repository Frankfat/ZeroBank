Feature: User login succesfully

  Background:
    When user logs in

  Scenario: Positive with valid credentials
    Then user enter valid credantials
    And user able to see Account Summary Page

    @login
    Scenario:  Negative
      Then user logs by using "username" and "123"
      And user see error message
