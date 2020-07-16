Feature: Account opened has Zero Balance

  Scenario: New Account with Zerop balance
    Given New User request new Account
    When Account is created
    Then Account balance is 0