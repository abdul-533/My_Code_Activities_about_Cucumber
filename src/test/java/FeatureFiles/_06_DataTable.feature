Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @Regression
  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | Al1777|
      | codeInput | 12345   |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | Al1777 |

    Then Success message should be displayed

  @SmoteTest  @Regression
  Scenario: Create Nationality
    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | Ali0020 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | Ali0020 |
    Then Success message should be displayed

  @Regression
  Scenario: Fee Functionality

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fee        |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | Ali0088 |
      | codeInput       | Az555   |
      | integrationCode | 001     |
      | priority        | 876     |

    And Click on the element in Dialog
      | nameInput  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | Ali0088 |
    Then Success message should be displayed








