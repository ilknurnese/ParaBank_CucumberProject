Feature: New Account Functionality

  Scenario Outline: Create new account and login account

    Given Navigate to paraBank website
    When Create new account firs name as "<firstName>" las name as "<lastName>" addres as "<addres>" city as "<city>" state as "<state>" zipcode as "<zipcode>" snn as "<SNN>" user name as "<userName>" password as "<password>" password confirm as "<confirm>" and click register button
    Then  User should login successfully
    Examples:
      | firstName | lastName | addres | city | state | zipcode | SNN | userName | password | confirm |
      | teschno | study | umraniye | istanbul | bos | yok | bilmem | team31 | team31234 | team31234 |