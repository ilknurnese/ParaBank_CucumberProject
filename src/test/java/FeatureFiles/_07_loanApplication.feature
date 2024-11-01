Feature: Loan application Functionality
Background:
  And   the user sees the "Customer Login" section on the home page.

  And   Who user logs with the following information:

    | team3 | team31234 |

  And The user confirms that you successfully login.



  Scenario Outline: Loan Application
    Given navigate to the request loan
    Then enter loan payment as "<loanPayment>"  down payment as "<downPayment>"click apply now button
    Then result message should be displayed
    Examples:
      | loanPayment |downPayment|
      | 20000       |200        |
