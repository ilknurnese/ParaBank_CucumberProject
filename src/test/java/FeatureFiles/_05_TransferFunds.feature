Feature: Transfer of Funds Functionality
  Background:
    And   the user sees the "Customer Login" section on the home page.

    And   Who user logs with the following information:

      | team3 | team31234 |

    And The user confirms that you successfully login.

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

