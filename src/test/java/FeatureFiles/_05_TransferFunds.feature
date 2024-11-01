Feature: Transfer of Funds Functionality

  Background:

    Given Navigate to paraBank website
    And Who user logs with the following information:
      | f | f |

  Scenario: Transfer of Funds
    And User Opens a new Account
    Then User should open new account successfully
    And The user confirms the second account number

  And Click on the Transfer Funds Link
  Then Transfer Page should be displayed
  And User inputs the amount
  And User selects From Account
  And User selects To Account
  And User Clicks Transfer Button
  Then User receives the Transfer Completed Confirmation Message

