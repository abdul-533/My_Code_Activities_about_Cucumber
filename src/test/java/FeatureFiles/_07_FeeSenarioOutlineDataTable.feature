#Senaryo :
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.
Feature: Fee multiple values Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fee Functionality

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fee        |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priority        | <priority> |

    And Click on the element in Dialog
      | nameInput  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | <name> |
    Then Success message should be displayed
    Examples:
      | name    | code | intCode      | priority |

      | Aze4300 | 0002 | paypal500    | 10091    |
      | Aze4200 | 0003 | cash5001     | 10092    |
      | Aze4100 | 0003 | applePay5001 | 10092    |
      | Aze4000 | 0003 | crypto5001   | 10092    |

