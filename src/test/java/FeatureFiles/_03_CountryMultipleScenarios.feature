Feature: Country Multi Scenario

  Background: #before scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Create country
    When Create a country
    Then Success message should be displayed

  Scenario: Create a country 2
    When Create a country name as "ali2Az44" code as "001001"
    Then Success message should be displayed