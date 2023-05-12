#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız.


Feature: Citizenship Functionality

  Background: #before scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    When Navigate to CitizenShip page


  Scenario Outline: Create a citizenship

    When User a citizenShip name as "<name>" shortname as "<short>"
    Then Success message should be displayed

    When User a citizenShip name as "<name>" shortname as "<short>"
    Then Already exist message should be displayed

    When User delete the "<name>"
    Then Success message should be displayed

    Examples:
      | name   | short |
      | AliAz0088 | AliAa00 |
      | AliAz0099 | AliAa00 |
      | AliAz0100 | AliAa00 |



