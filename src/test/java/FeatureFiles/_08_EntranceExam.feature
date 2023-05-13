#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız

Feature: Entrance Exams Functionality testing

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Exam create and deletet

    And Click on the element in LeftNav
      | entranceExam |
      | exSetup      |
      | enterExam    |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | Ali1997 |

    And Click on the element in Dialog
      | addPeriod  |
      | addPeriod1  |
      | gradeLevel |
      | gradeLevel1 |

    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

    And Click on the element in LeftNav
      | entranceExam |
      | exSetup      |
      | enterExam    |

    And User delete item from Dialog Content
      | Ali1997 |
    Then Success message should be displayed
