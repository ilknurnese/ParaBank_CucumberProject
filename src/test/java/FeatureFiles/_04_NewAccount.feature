Feature: Transfer of Funds Functionality

  Background:

    Given Navigate to paraBank website
    And Who user logs with the following information:
      | w  | w |

  Scenario: Transfer of Funds
    And User Opens a new Account
    Then User should open new account successfully
