Feature:  Update Contact Functionality

  Scenario: Update Contact info
    Given Navigate to paraBank website

    And Who user logs with the following information:
      | w | w |
    When User Should update contect info and click update Profile button
    Then User should update info successfully
