Feature: DataTable Example

  Scenario: Users list
    When Write username"abdul"
    And Write userName and Password "abdul" and "1234"
    And Write usernames as DataTable
      | Abdul |
      | Orxan |
      | Ismet |
    And Write username and password as DataTable
      | ismet  | 1234 |
      | mehmet | 2324 |
      | ayshe  | 4545 |
      | kaya   | 4554 |
