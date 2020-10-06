@Products
Feature: Small Business Banking Account Homepage


Background:
Given the is  user  is on "TD Small Business Bank Account Home Page"
Then the user hover over Products

@accountsProduct
Scenario: Verify navigation to Accounts
When the user clicks on Accounts
Then the user should be able navigate to Account page

@CreditCardProduct
Scenario: Verify navigation to Credit cards
When the user clicks on Credit Cards
Then the user should be able navigate to Credit Cards page

