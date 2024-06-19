Feature: Gift-Card Page Scenarios

  Scenario Outline: Enter Gift Card Details
    Given navigate to home page
    And Click on GiftCards Label
    And Select Birthday/Anniversary Option
    And Enter Amount "<Amount>" and Select Date and Month
    And Fill To "<To_name>", "<To_Email>", "<To_Phone>" details
    When Fill From  "<From_name>", "<From_Email>", "<From_Phone>", "<Address>", "<Pincode>" details
    Then Validate the Displayed Details "<Amount>", "<To_name>", "<To_Email>", "<To_Phone>", "<From_name>", "<From_Email>", "<From_Phone>", "<Address>", "<Pincode>", "<Message>"

    Examples: 
      | Amount | To_name | To_Email | To_Phone | From_name | From_Email | From_Phone | Address | Pincode | Message |
      |      1 |       1 |        1 |        1 |         1 |          1 |          1 |       1 |       1 | Invalid |
      |      2 |       2 |        2 |        2 |         2 |          2 |          2 |       2 |       2 | Valid   |
