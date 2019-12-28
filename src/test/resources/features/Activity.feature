@wip
Feature: Account types
  Background:
    When user logged in

  Scenario: Account summary types
    Then user should see types of acoount names

    Scenario: Credit acount
      Then Credit account table must have following columns
      |Account     |
      |Credit Card |
      |Balance     |
