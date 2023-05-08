#senaryo
  #siteye git->test case->adim
  #login bilgilerini gir





Feature: Login Functionality
  @SmokeTest
  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully