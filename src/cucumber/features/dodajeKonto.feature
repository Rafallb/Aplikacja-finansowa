Feature: Add account
  Scenario: Add account to address https://fintech-testlab.coderslab.pl/login
    Given Landing page https://fintech-testlab.coderslab.pl/login opened in browser
    When Login to account
    And Create an account
    And Add payment
    And Add paycheck Nowe konto aktywowów
    And Add expence
    And Add income
    And Add commitment
    And Add budget
    And Add Piggy Bank
    And Add new paycheck
    Then check report