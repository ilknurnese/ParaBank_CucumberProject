Feature: Loan application Functionality




  Scenario Outline: Loan Application
    Given navigate to the request loan
    Then enter loan payment as "<loanPayment>"  down payment as "<downPayment>"click apply now button
    Then result message should be displayed
    Examples:
      | loanPayment |downPayment|
      | 20000       |200        |
